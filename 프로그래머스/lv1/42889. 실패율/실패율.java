import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        Integer[] result_Integer = new Integer[N];  //층수만큼 배열
	int total = stages.length;  //타겟크기
	Map<Integer, Double> result = new HashMap<>(); //내림차순을 위한 키,벨류를 위한 맵
	int total_cnt = total;  //샐패율을 계산할 동적 정수
	for(int i=1; i<=N; i++) //층수만큼 반복 : 층마다 실패율적립
	{ 
		Double fail=0.0;
		for(int j=0; j<total; j++)
		{
			if(stages[j]<=i)
			{
				fail++;
				stages[j]=N+10; //제한사항 stages에는 1 이상 N + 1 이하의 자연수가 담겨있다 를 이용
			}
		}
		if(fail==0.0 || total_cnt==0) //분모or분자가 0일때 고정 주입 이것때문에 쓸데없이 시간버림
		{
			result.put(i,0.0);
		}else{
			result.put(i,fail/total_cnt); //계산한 실패율을 키(층수) 의 벨류값에 put
		}

		int fail_chk = Integer.parseInt(String.valueOf(Math.round(fail)));
		total_cnt= total_cnt-fail_chk;  //카운트한 인원 제외
	}

	//내림차순을 위해 래퍼클래스어야 함
	List<Integer> listKeySet = new ArrayList<>(result.keySet());
	Collections.sort(listKeySet, (value1, value2) -> (result.get(value2).compareTo(result.get(value1))));

	//내림차순한 순서의 키(층수)를 인덱스 순서별로 배열정리
	int idx=0;
	for(Integer key : listKeySet) {
		result_Integer[idx]= key;
		idx++;
	}
	//리턴형인 int로 형변환
	int[] answer = Arrays.stream(result_Integer).mapToInt(Integer::intValue).toArray();
	System.out.println(Arrays.toString(answer));
        return answer;
    }
}

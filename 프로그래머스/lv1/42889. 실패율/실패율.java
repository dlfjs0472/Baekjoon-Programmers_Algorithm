import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        Integer[] result_Integer = new Integer[N];  //층수만큼 배열
		int total = stages.length;  //타겟크기
		Map<Integer, Double> result = new HashMap<>(); //내림차순을 위한 키,벨류를 위한 맵
		int total_cnt = total;  //샐패율을 계산할 동적 정수
		for(int i=1; i<=N; i++)
		{ 
			Double fail=0.0;
			for(int j=0; j<total; j++)
			{
				if(stages[j]<=i)
				{
					fail++;
					stages[j]=N+10;
				}
			}
			if(fail==0.0 || total_cnt==0)
			{
				result.put(i,0.0);
			}else{
				result.put(i,fail/total_cnt);
			}
			
			int fail_chk = Integer.parseInt(String.valueOf(Math.round(fail)));
			total_cnt= total_cnt-fail_chk;
		}
		for (Map.Entry<Integer, Double> pair : result.entrySet()) {
			System.out.println(String.format("Key (name) is: %s, Value (age) is : %s", pair.getKey(), pair.getValue()));
		}
		List<Integer> listKeySet = new ArrayList<>(result.keySet());
		Collections.sort(listKeySet, (value1, value2) -> (result.get(value2).compareTo(result.get(value1))));

		int idx=0;
		for(Integer key : listKeySet) {
			result_Integer[idx]= key;
			idx++;
		}
		int[] answer = Arrays.stream(result_Integer).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();	//첫 입력받은 수(반복횟수)
        int[] V = new int[N];
        for (int i = 0; i <N; i++)
		{
			V[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int cnt=0;
		for(Integer num : V){
			if(num == target)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
    }

}
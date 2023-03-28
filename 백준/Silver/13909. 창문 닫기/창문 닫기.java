import java.util.*;

public class Main{
	public static boolean sosu(int a) {
		for (int i = 1; i <= a; i++) {
            if (a % i == 0) return false;
        }
		return true;
	}
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int peoples = in.nextInt();
		in.close();
		int result=0;
		for(int i=1; i*i<=peoples; i++)
		{
			result++;
		}
		System.out.println(result);
		// 시도했다가 메모리 초과 발생 결과 확인해보니 제곱근 창문만 true로 남음
		// int result=0;
		// in.close();
		// boolean windows[] = new boolean[peoples+1]; //0번째
		// Arrays.fill(windows,true);
		// for(int i=2; i<=peoples; i++)
		// {
		// 	int cnt = (peoples/i);
		// 	for(int j=1; j<=cnt; j++)
		// 	{
		// 		windows[(i*j)] = !windows[(i*j)];
		// 	}
		// }
		// for(int z=1; z<=peoples; z++)
		// {
		// 	if(windows[z])
		// 	{
		// 		result++;
		// 	}
		// }
		// System.out.println(result);
	}
}
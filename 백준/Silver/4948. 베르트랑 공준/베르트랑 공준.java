import java.util.*;
import java.io.IOException;
import java.math.BigInteger;

public class Main
{
	// 시간초과 실패
	// public static int sosu(int a) {
	// 	int cnt=0;
	// 	for(long i=a+1; i<=a*2; i++)
	// 	{
	// 		BigInteger bigInt = new BigInteger(String.valueOf(i));
    //         if (bigInt.isProbablePrime(10)) { //매개변수에 0,음수(-)넣으면 always true
    //             cnt++;
    //         }
	// 	}
	// 	return cnt;
	// }
	public static boolean sosu(int a) {
		for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
		return true;
	}
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int target = in.nextInt();
			if(target==0)
			{
				break;
			}else{
				int cnt=0;
				for(int i=target+1; i<=2*target; i++)
				{
					if(sosu(i))
					{
						cnt++;
					}
				}
				System.out.println(cnt);
			}
			
		}
		in.close();
	}
}

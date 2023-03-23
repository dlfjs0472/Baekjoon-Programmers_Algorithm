import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		long target;
		for(int i=0; i<cnt; i++)
		{
			target = Long.parseLong(br.readLine());
			BigInteger bigInt = new BigInteger(String.valueOf(target));
            if (bigInt.isProbablePrime(10)) { //매개변수에 0,음수(-)넣으면 always true
                System.out.println(bigInt);
            }
            else {
                System.out.println(bigInt.nextProbablePrime());
            }
		}
	}
    
}

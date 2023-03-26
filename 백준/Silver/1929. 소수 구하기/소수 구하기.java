import java.util.*;
import java.io.IOException;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
   	 	int start = in.nextInt();
		int end = in.nextInt();
		in.close();

		for(long i=start; i<=end; i++)
		{
			BigInteger bigInt = new BigInteger(String.valueOf(i));
            if (bigInt.isProbablePrime(10)) { //매개변수에 0,음수(-)넣으면 always true
                System.out.println(bigInt);
            }
		}
	}
    
}

import java.util.*;
import java.io.IOException;

public class Main
{

    public static long divisor(long a, long b) {
 
		while (b != 0) {
			long r = a % b; 

			a = b;
			b = r;
		}
		return a;
	}
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		long first = in.nextInt();
		long second = in.nextInt();
		in.close();
		long divisor = divisor(first,second);
		System.out.println((first * second / divisor));
	}
    
}

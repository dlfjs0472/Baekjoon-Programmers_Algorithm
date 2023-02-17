import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long A = in.nextInt();
		long B = in.nextInt();
		long V = in.nextInt();
		in.close();
		long result = (V - A) / (A - B);

		if ((V - A) % (A - B) == 0) {
			System.out.println(result + 1);
		} else {
			System.out.println(result + 2);
		}
    }
	
}
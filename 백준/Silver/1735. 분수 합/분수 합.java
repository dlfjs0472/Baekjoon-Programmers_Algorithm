import java.util.*;
import java.io.IOException;

public class Main
{

    public static int divisor(int a, int b) {
 
		while (b != 0) {
			int r = a % b; 

			a = b;
			b = r;
		}
		return a;
	}
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int ja_1 = in.nextInt();
		int mo_1 = in.nextInt();
		int ja_2 = in.nextInt();
		int mo_2 = in.nextInt();
		in.close();
		int ja = (ja_1*mo_2)+(ja_2*mo_1);
		int mo = mo_1*mo_2;

		int div= divisor(ja,mo);
		
		System.out.print(ja/div+" ");
		System.out.print(mo/div);



	}
    
}

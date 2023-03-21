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
   	 	int cnt = in.nextInt();
        int[] arr = new int[cnt];

        for(int i=0; i<arr.length; i++)
        {
			int first = in.nextInt();
			int second = in.nextInt();
			int divisor = divisor(first,second);
			System.out.println((first * second / divisor));
        }
        in.close(); 
	}
    
}

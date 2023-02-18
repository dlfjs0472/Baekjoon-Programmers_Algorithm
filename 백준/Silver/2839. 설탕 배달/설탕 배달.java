import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		in.close();
		if(x<3 || x==4 || x==7){
			System.out.println("-1");
		}
		else if(x%5==0)
		{
			System.out.println(x/5);
		}else if(x % 5 == 1 || x % 5 == 3){
			System.out.println((x/5)+1);
		}else if(x % 5 == 2 || x % 5 == 4){
			System.out.println((x/5)+2);
		}
		
    }
	
}
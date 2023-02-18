import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int line = 1;
		
		while(x>line){
			x-=line;
			line++;
		}

		if(line%2==0)
		{
			System.out.println(x+"/"+(line-x+1));
		}else{
			System.out.println(line-x+1+"/"+x);
		}
		
    }
	
}
import java.util.*;

public class Main{
     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
		in.close();
		for(int i=2; i<x; i++)
		{
			while(x%i==0)
			{
				System.out.println(i);
				x = x/i;
			}
		}
		if(x!=1)
		{
			System.out.println(x);
		}
     }
}
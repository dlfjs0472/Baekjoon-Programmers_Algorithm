import java.util.*;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		int[] rest = new int[10];
		String result;
		int cnt=0;
		for(int i = 0; i < 10; i++)
		{
			rest[i] = in.nextInt()%42;
		}
		in.close();

		for(int i=0; i < rest.length; i++)
		{
			result="N";
			for(int j = i+1; j < rest.length; j++)
			{
				if(rest[i] == rest[j])
				{
					result="Y";
					break;
				}
			}
			if(result=="N")
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
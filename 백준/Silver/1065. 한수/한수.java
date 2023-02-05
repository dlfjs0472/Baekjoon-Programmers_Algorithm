import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		int cnt = 0; 
		for(int i = 1; i <= num; i++)
		{	
			if(i<100)
			{
				cnt++;
			}else if(i<1000)
			{
				String[] num_str = Integer.toString(i).split("");
				if((Integer.parseInt(num_str[1]) - Integer.parseInt(num_str[0])) == (Integer.parseInt(num_str[2])- Integer.parseInt(num_str[1])))
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
    }
}
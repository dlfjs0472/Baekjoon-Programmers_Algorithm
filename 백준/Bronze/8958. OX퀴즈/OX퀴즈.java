import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] OX = new String[N];
		for(int i=0; i<OX.length; i++)
		{
			OX[i]=in.next();
		}
		in.close();
		for (int i = 0; i < OX.length; i++) {
			int sum = 0;
			int cnt = 0;
			for(int j = 0; j < OX[i].length(); j++)
			{
				char Char = OX[i].charAt(j);
				if(Char == 'O') {
                    cnt++;
                } else if(Char == 'X') {
                    cnt = 0;
                }
				sum+=cnt;
			}
			System.out.println(sum);
		}	
	}
}
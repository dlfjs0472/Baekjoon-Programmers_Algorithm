import java.util.*;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		int[] student = new int[31];
       
		for (int i = 1; i < 29; i++) {			//숙제한 학생 체크
			student[in.nextInt()] = 'Y';
		}
		in.close();

		for(int i = 1; i < 31; i++)
		{
			if(student[i]!='Y')
			{
				System.out.println(i);
			}
		}
		
	}
}
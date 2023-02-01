import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] all_student = new int[in.nextInt()];

		for(int i=0; i<all_student.length; i++)
		{
			int num = in.nextInt();
			int[] student = new int[num];
			double sum = 0;
			for(int j=0; j<num; j++)
			{
				int grade = in.nextInt();
				sum+=grade;
				student[j]=grade;
			}
			double avg = sum/num;
			double cnt=0;
			for(int z=0; z<student.length; z++)
			{
				if(student[z]>avg)
				{
					cnt++;
				}
			}
			System.out.println(String.format("%.3f",Math.round(cnt/num*100*1000)/1000.0)+"%");
		}
		in.close();
	}
}
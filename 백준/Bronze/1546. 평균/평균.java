import java.util.*;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double[] avg = new double[N];
		double sum = 0;
		for(int i=0; i<avg.length; i++)
		{
			avg[i]=in.nextInt();
		}
		in.close();
		Arrays.sort(avg);
		for(int i = 0; i < avg.length; i++) {
			double result =  ((avg[i] / avg[avg.length-1]) * 100);
			sum +=result;
		}
		System.out.println(sum/N);
	}
}
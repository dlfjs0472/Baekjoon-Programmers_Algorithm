import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        
        int last = 0;
		int first = 0;
		int testNum = in.nextInt();
		for(int i=0; i<testNum; i++) {
			int h = in.nextInt();
			int w = in.nextInt(); //순서대로 들어가서 의미 없음
			int n = in.nextInt();
			
			if(n%h == 0) {
				last = n/h;
				first = h;	//나머지가 0이면 꼭대기라는 소리 = 층수
			}
			else {
				last = n/h+1;
				first = n%h;
			}
			
			System.out.println((first*100)+last);
		}
		in.close();
    }
	
}
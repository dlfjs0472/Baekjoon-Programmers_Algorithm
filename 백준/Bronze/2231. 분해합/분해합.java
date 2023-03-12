import java.util.*;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
   	 	int num = in.nextInt();
        int result=0;

        for(int i = 0; i < num; i++) {
            int number = i;
            int sum = 0;	

            while(number != 0) {
                sum += number % 10;	
                number /= 10;
            }

            if(sum + i == num) {
                result = i;
                break;
            }
        }			
        System.out.println(result);
	}
}

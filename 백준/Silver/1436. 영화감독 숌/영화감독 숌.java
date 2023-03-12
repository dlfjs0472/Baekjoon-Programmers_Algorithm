import java.util.*;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
   	 	int num = in.nextInt();
        int target = 666;
        int cnt=1;
        in.close();

        while(cnt != num) {
            target++;
            if(String.valueOf(target).contains("666")) { 
                cnt++;
            }
        }
        System.out.println(target);
                
        
	}
}

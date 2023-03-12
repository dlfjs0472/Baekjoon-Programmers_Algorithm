import java.util.*;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
   	 	int total = in.nextInt();
        int[][] arr = new int[total][2];
        for(int i = 0; i < total; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        in.close();
        for(int i = 0; i < total; i++) {
            int grade = 1;	
                    
            for(int j = 0; j < total; j++) {
                if(i == j) continue;	
         
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    grade++;
                }
            }
            System.out.print(grade + " ");
        }
	}
}

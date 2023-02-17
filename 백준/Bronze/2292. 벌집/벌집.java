import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
		in.close();
        int cnt=1;
		int step=1;
        while(cnt < num){
            cnt += 6*(step++);
        }
        System.out.println(step);
    }
	
}
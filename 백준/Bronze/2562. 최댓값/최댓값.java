import java.util.*;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
        int[] arr = new int[9];
		
       
		for (int i = 0; i < 9; i++) {
			arr[i] = in.nextInt();			//배열누적 9번
		}
		in.close();

		int cnt = 0;
		int max = 0;
		int index = 0;

		for(int value : arr) {				//반복하며 최대값확인
			cnt++;
			if(value > max) {
				max = value;
				index = cnt;
			}
		}
		System.out.print(max + "\n" + index);
	}
}
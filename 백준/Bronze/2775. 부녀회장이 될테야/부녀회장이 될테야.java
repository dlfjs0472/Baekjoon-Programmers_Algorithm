import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int[][] APT = new int[15][15];
 
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;	// 각층 1호는 1명
			APT[0][i] = i;	// 1층은 호수별 인원
		}

		for(int i = 1; i < 15; i ++) {	//층수
			for(int j = 2; j < 15; j++) {	//호수
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];	
			}
		}
		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			int k = in.nextInt();
			int n = in.nextInt();
			System.out.println(APT[k][n]);
		}
		in.close();
    }
	
}
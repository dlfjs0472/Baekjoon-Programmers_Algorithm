import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] numArr = new int[n][m];

        for ( int i = 0; i < 2; i++ ) {		// 2개의 행열을 입력 받는다.
            for ( int j = 0; j < n; j++ ) {	// n 개의 행을 입력 읽는다.
                st = new StringTokenizer(br.readLine());
                for ( int k = 0; k < m; k++ ) {	// n번째 줄의 m번째 열
                    if ( i == 1 ) {				// B 번째 행열을 입력 받으면 기존 A 행열에 더한다.
                        numArr[j][k] = numArr[j][k] + Integer.parseInt(st.nextToken());
                    } else {					// A 번째 행열을 입력 받는다.
                        numArr[j][k] = Integer.parseInt(st.nextToken());
                    }
                }
            }
        }

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
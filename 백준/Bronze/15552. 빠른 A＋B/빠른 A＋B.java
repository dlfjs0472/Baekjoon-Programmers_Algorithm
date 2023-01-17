import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
    public static void main(String[] args) throws IOException {    
        // BufferedReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 반복문을 수행할 횟수를 입력할 변수 선언 및 입력
        String s = br.readLine();
        int ss = Integer.parseInt(s);
        
        //합계를 입력할 변수 선언
        int sum;
        
        // 합계를 구할 변수 선언
        String[] b;
        
        // BufferedWriter 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 반복문을 사용해 s만큼 반복 수행
        for(int i = 0; i < ss; i++)
        {
            // 두 개의 변수에 값을 입력
            b = br.readLine().split(" ");
            
            // 두개를 더 한 값을 bw변수에 넣는다
            sum = Integer.parseInt(b[0]) + Integer.parseInt(b[1]);
            bw.write(Integer.toString(sum) + "\n");
        }
 
        // 데이터 출력 및 close
        bw.flush();
        bw.close();
        br.close();
    }
}

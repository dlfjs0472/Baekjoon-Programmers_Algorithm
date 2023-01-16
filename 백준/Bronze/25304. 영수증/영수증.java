import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int price = 0;
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			price += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		}
		
		if(price == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
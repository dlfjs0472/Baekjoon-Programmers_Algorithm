import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(in.readLine());
		Login_DB[] arr = new Login_DB[total];
		//배열생성
		for(int i = 0; i < total; i++) {
			String[] rs = in.readLine().split(" ");
			int age = Integer.parseInt(rs[0]);
			String name = rs[1];
			arr[i] = new Login_DB(age, name);
		}
		//오름차순
		Arrays.sort(arr, new Comparator<Login_DB>() {
			public int compare(Login_DB s1, Login_DB s2) {
				return s1.age - s2.age;
			}
		});
 
		StringBuilder sb = new StringBuilder();
		//문자열 합치기
		for(int i = 0; i < total; i++) {
			sb.append(arr[i]);
		}
        
		System.out.println(sb);
		
	}
    
	//나이,이름 문자열반환
	public static class Login_DB {
		int age;
		String name;
        
		public Login_DB(int age, String name) {
			this.age = age;
			this.name = name;
		}
        
		public String toString() {
			return age + " " + name + "\n";
		}
	}
 
}
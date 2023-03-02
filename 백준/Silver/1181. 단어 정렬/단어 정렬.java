import java.util.*;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(in.readLine());
		String[] arr = new String[total];
		//배열생성
		for (int i = 0; i < total; i++) {
			arr[i] = in.readLine();
		}
		//비교
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				else {
					return s1.length() - s2.length();
				}
			}
		});
		//중복값 제거
		List<String> result_arr = Arrays.asList(arr)
        .stream()
        .distinct()
        .collect(Collectors.toList());

		for(String rs : result_arr)
		{
			System.out.println(rs);
		}

	}
}
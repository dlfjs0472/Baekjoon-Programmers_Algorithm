import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(in.readLine());
		int[][] arr = new int[total][2];
		
		for(int i = 0 ; i < total ; i++) {
			String[] rs = in.readLine().split(" ");
			int rs_1 = Integer.parseInt(rs[0]);
			int rs_2 = Integer.parseInt(rs[1]);
			arr[i][0] = rs_1;
			arr[i][1] = rs_2;
		}

		Arrays.sort(arr, new Comparator<int[]>() { 
			public int compare(int[] o1, int[] o2) {
				return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
			}
		});
		for (int j = 0; j < total; j++) {
			System.out.println(arr[j][0] + " " + arr[j][1]);
		}
	}
}
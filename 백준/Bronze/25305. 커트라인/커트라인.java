import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		int cut_line = in.nextInt();
        int[] arr = new int[total];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[total - cut_line]);
	}
}

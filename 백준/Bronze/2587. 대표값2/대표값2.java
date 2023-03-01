import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            int num = in.nextInt();
            arr[i] = num;
            sum+= num;
        }
        Arrays.sort(arr);
        System.out.println(sum/5);
        System.out.println(arr[2]);
	}
}

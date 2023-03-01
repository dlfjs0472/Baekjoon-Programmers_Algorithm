import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int z=0; z<arr.length; z++)
        {
            System.out.println(arr[z]);
        }
	}
}

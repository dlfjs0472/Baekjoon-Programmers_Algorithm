import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<total; i++)
        {
            arr.add(in.nextInt());
        }
        Collections.sort(arr);
        for(int value : arr) {
			result.append(value).append('\n');
		}
		System.out.println(result);
	}
}

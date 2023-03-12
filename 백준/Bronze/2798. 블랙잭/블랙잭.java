import java.util.*;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
   	 	int total = in.nextInt();
        int target = in.nextInt();
        int[] arr = new int[total];
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<total; i++)
        {
            arr[i] = in.nextInt();
        }

        in.close();

        Integer[] array_num = Arrays.stream(arr).boxed().toArray(Integer[]::new); //wrapping
        Arrays.sort(array_num, Comparator.reverseOrder());        //내림차순

        for(int i=0; i<array_num.length; i++)
        {
            if(i==array_num.length-2) break;
            for(int j=i+1; j<array_num.length; j++)
            {
                for(int z=j+1; z<array_num.length; z++)
                {
                    int sum= array_num[i]+array_num[j]+array_num[z];
                    //System.out.println("첫번째("+array_num[i]+")+두번째("+array_num[j]+")+세번째("+array_num[z]+") = "+sum);
                    result.add(sum);
                }
            }
        }
        Collections.sort(result, Collections.reverseOrder());
        //System.out.println("내림차순 : " + result);
        for(int val : result )
        {
            if(val <= target)
            {
                System.out.println(val);
                break;
            }
        }

	}
}

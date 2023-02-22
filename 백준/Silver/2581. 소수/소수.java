import java.util.*;

public class Main{
     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
		in.close();
        List<Integer> arr = new ArrayList<>();
		int sum=0;
		for(; min<=max; min++)
		{
			int flag=0;
			if (min == 1 || max == 1) {
				continue;
			}
			for(int i=2; i<min; i++)
			{
				if(min%i==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				sum+=min;
				arr.add(min);
			}
		}
		if(arr.size()==0)
		{
			System.out.println("-1");
		}else{
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
     }
}
import java.util.*;

public class Main{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(true)
        {
            int x = in.nextInt();
            if(x == -1) break;
            int sum = 0;
            List<Integer> arr = new ArrayList<>();
            for(int i=1; i<=x; i++)
            {
                if(x%i==0)
                {
                    arr.add(i);
                    sum+=i;
                }
            }
            if((sum-x)==x)
            {
                System.out.print(x+" = ");
                for(int j=0; j<arr.size()-1; j++)
                {
                    if((arr.size()-2)!=j)
                    {
                        System.out.print(arr.get(j)+" + ");
                    }else{
                        System.out.println(arr.get(j));
                    }
                }
            }else{
                System.out.println(x+" is NOT perfect.");
            }
        }
        
    }
}
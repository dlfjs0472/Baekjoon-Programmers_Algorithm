/* Online Java Compiler and Editor */
import java.util.*;

public class Main{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int t = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=1; i<=x; i++)
        {
            if(x%i==0)
            {
                arr.add(i);
            }
        }
        if(arr.size()>=t){
            System.out.println(arr.get(t-1));
        }else{
            System.out.println("0");
        }
     }
}

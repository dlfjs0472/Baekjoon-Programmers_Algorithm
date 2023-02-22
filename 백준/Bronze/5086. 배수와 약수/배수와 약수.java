import java.util.*;

public class Main{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(true)
        {
            int x = in.nextInt();
            int y = in.nextInt();
            if(x == 0 && y==0) break;
            if(x % y == 0){
                System.out.println("multiple");
            }else if(y % x == 0){
                System.out.println("factor");
            }else{
                System.out.println("neither");
            }
        }
        
    }
}
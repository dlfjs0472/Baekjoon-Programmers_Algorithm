import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
 
		int start_money = in.nextInt();
		int need_money = in.nextInt();
		int price = in.nextInt();
        
		if (price <= need_money) {
			System.out.println("-1");
		} 
		else {
            int BI=(start_money/(price-need_money));
            System.out.println(BI+1);
		}
	}
}
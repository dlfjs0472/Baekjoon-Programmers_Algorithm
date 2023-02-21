import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int total = 0;
        for (int i =0; i<N; i++) {
            int a = sc.nextInt();
            for (int j =2; j<=a; j++) {
                if (a % j ==0) {
                    cnt++;
                }
            }
            if (cnt ==1) {
                total++;
            }
            cnt =0;
        }
        System.out.println(total);
    }
}
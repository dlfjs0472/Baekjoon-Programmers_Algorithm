public class Main {
    public static void main(String[] args){
        boolean[] arr = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int num = kaprekar(i);
            arr[num] = true;
        }
        for (int i = 1; i <= 10000; i++) {
            if (!arr[i])
			{
				System.out.println(i);
			}
        }
    }

    public static int kaprekar(int num) {
        int sum = num;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum <= 10000) return sum;
        return 0;
    }
}
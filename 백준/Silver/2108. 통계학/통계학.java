import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   	 	int total = Integer.parseInt(in.readLine());

        int[] arr = new int[total];
        int[] plus = new int[4002];
		int[] minus = new int[4001];
        double sum = 0.00;
        int max = 0;

        for(int i = 0 ; i < total ; i++)
        {
            int val = Integer.parseInt(in.readLine());
            arr[i] = val;
            sum+= val;
        }
        System.out.println(Math.round(sum/total));  //산술평균
        Arrays.sort(arr);
        if(total==1)
        {
            System.out.println(arr[0]); //중앙값
        }else{
            System.out.println(arr[arr.length/2]);  //중앙값
        }
        
       

        for(int i=0;i<total;i++)
        {
            if(arr[i] <0) {
                minus[Math.abs(arr[i])]++;
            }

            else {
                plus[arr[i]]++;
            }
        }

        for(int i=0;i<plus.length;i++)
        {
            max = Math.max(max, plus[i]);
        }

        for(int i=0;i<minus.length;i++)
        {
            max = Math.max(max, minus[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr) {
			if(i<0) {
				if(minus[Math.abs(i)] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
			else {
				if(plus[i] == max && !(list.contains(i))) {
					list.add(i);
				}
			}
		}
		int c =0;
		if(list.size()>=2) {
			c = list.get(1);
		}
		else {
			c = list.get(0);
		}
        System.out.println(c); //최빈값
        System.out.println(arr[arr.length-1]-arr[0]); //범위
	}
}

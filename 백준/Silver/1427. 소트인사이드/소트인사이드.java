import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   	 	String total = in.readLine();
        String[] strArray = total.split("");
        Arrays.sort(strArray, Comparator.reverseOrder());
        for(String s : strArray) {
            System.out.print(s);
        }
	}
}

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class Solution {
    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];

        Map<String, Integer> indexMap = new HashMap<>();
        String[] strings = s.split("");

        for (int i = 0; i < length; i++) {
            String temp = strings[i];
            if (!indexMap.containsKey(temp)) {
                answer[i] = -1;
            } else {
                int index = indexMap.get(temp);
                answer[i] = i - index;
            }
            indexMap.put(temp, i);
        }
        return answer;
    }

}
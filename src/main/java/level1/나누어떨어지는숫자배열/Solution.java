package level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution1(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return new int[] {-1};
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        if (answer.length == 0) return new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }
}

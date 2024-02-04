package level0.n의배수고르기;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int[] solution1(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }

    public int[] solution2(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) list.add(i);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

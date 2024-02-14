package level1.예산;

import java.util.Arrays;

public class Solution {

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for (int i : d) {
            if (budget < i) break;
            budget -= i;
            count++;
        }
        return count;
    }
}

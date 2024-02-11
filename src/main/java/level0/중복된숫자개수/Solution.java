package level0.중복된숫자개수;

import java.util.Arrays;

public class Solution {

    public int solution1(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) {
                answer++;
            }
        }
        return answer;
    }
    public int solution2(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}

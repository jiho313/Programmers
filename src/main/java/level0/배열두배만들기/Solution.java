package level0.배열두배만들기;

import java.util.Arrays;

public class Solution {

    public int[] solution1(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public int[] solution2(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}

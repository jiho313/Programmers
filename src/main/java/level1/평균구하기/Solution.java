package level1.평균구하기;

import java.util.Arrays;

public class Solution {

    public double solution1(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }

    public double solution2(int[] arr) {
        double avg = 0.0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (double) sum / arr.length;
        return avg;
    }
}

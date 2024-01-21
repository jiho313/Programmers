package level1.제일작은수제거하기;

import java.util.Arrays;

public class Solution {

    public int[] solution1(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i : arr) {
            if (i != min) {
                answer[index] = i;
                index ++;
            }
        }
        return answer;
    }

    public int[] solution2(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}

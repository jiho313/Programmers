package level0.배열의원소만큼추가하기;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr) {
        int size = Arrays.stream(arr).sum();
        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx] = arr[i];
                idx ++;
            }
        }
        return answer;
    }
}

package level0.뒤에서5등까지;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}

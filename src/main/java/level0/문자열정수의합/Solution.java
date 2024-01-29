package level0.문자열정수의합;

import java.util.Arrays;

public class Solution {

    public int solution1(String num_str) {
        String[] strings = num_str.split("");
        int answer = 0;
        for (String string : strings) answer += Integer.parseInt(string);
        return answer;
    }

    public int solution2(String num_str) {
        String[] strings = num_str.split("");
        return Arrays.stream(strings).mapToInt(Integer::parseInt).sum();
    }

}

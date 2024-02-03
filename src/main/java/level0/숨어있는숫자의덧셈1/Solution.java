package level0.숨어있는숫자의덧셈1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

    public int solution1(String my_string) {
        char[] chars = my_string.toCharArray();
        int answer = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                answer += c - '0';
            }
        }
        return answer;
    }
    public int solution2(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)
                .map(c -> c - '0')
                .sum();
    }
}

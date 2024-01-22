package level0.배열자르기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        Solution solution = new Solution();
        int[] answer = solution.solution(numbers, num1, num2);
        int[] expected = {2, 3, 4};
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[] numbers = {1, 3, 5};
        int num1 = 1;
        int num2 = 2;
        Solution solution = new Solution();
        int[] answer = solution.solution(numbers, num1, num2);
        int[] expected = {3, 5};
        Assertions.assertThat(answer).isEqualTo(expected);
    }


}
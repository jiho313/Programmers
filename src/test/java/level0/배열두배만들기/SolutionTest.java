package level0.배열두배만들기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int[] numbers = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        int[] answer1 = solution.solution1(numbers);
        int[] answer2 = solution.solution2(numbers);
        int[] expected = {2, 4, 6, 8, 10};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        Solution solution = new Solution();
        int[] answer1 = solution.solution1(numbers);
        int[] answer2 = solution.solution2(numbers);
        int[] expected = {2, 4, 200, -198, 2, 4, 6};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
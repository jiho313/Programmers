package level0.문자열정수의합;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        String num_str = "123456789";
        Solution solution = new Solution();
        int answer1 = solution.solution1(num_str);
        int answer2 = solution.solution2(num_str);
        int expected = 45;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        String num_str = "10000000";
        Solution solution = new Solution();
        int answer1 = solution.solution1(num_str);
        int answer2 = solution.solution2(num_str);
        int expected = 1;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
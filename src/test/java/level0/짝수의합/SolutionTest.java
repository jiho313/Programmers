package level0.짝수의합;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int n = 10;
        Solution solution = new Solution();
        int answer1 = solution.solution1(n);
        int answer2 = solution.solution2(n);
        int expected = 30;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
    @Test
    void solution2() {
        int n = 4;
        Solution solution = new Solution();
        int answer = solution.solution1(n);
        int expected = 6;
        assertThat(answer).isEqualTo(expected);
    }
}
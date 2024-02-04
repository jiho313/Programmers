package level1.문자열다루기기본;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        String s = "a234";
        Solution solution = new Solution();
        boolean answer1 = solution.solution1(s);
        boolean answer2 = solution.solution2(s);
        boolean expected = false;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        String s = "1234";
        Solution solution = new Solution();
        boolean answer1 = solution.solution1(s);
        boolean answer2 = solution.solution2(s);
        boolean expected = true;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
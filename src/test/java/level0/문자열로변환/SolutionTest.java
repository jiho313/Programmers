package level0.문자열로변환;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int n = 123;
        Solution solution = new Solution();
        String expected = "123";
        String answer1 = solution.solution1(n);
        String answer2 = solution.solution2(n);
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
    @Test
    void solution2() {
        int n = 2573;
        Solution solution = new Solution();
        String expected = "2573";
        String answer1 = solution.solution1(n);
        String answer2 = solution.solution2(n);
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

}
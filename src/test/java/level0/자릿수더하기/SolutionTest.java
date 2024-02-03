package level0.자릿수더하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int n = 1234;
        Solution solution = new Solution();
        int answer = solution.solution(n);
        int expected = 10;
        assertThat(answer).isEqualTo(expected);
    }
    @Test
    void solution2() {
        int n = 930211;
        Solution solution = new Solution();
        int answer = solution.solution(n);
        int expected = 16;
        assertThat(answer).isEqualTo(expected);
    }
}
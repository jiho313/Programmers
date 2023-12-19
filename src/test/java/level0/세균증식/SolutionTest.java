package level0.세균증식;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int n = 2;
        int t = 10;
        Solution solution = new Solution();
        int answer = solution.solution(n, t);
        int expected = 2048;
        assertThat(answer).isEqualTo(expected);
    }
    @Test
    void solution2() {
        int n = 7;
        int t = 15;
        Solution solution = new Solution();
        int answer = solution.solution(n, t);
        int expected = 229376;
        assertThat(answer).isEqualTo(expected);
    }

}
package level1.예산;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        Solution solution = new Solution();
        int answer = solution.solution(d, budget);
        int expected = 3;
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        Solution solution = new Solution();
        int answer = solution.solution(d, budget);
        int expected = 4;
        assertThat(answer).isEqualTo(expected);
    }

}
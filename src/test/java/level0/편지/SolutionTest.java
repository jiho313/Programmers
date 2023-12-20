package level0.편지;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        String message = "happy birthday!";
        Solution solution = new Solution();
        int answer = solution.solution(message);
        int expected = 30;
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        String message = "I love you~";
        Solution solution = new Solution();
        int answer = solution.solution(message);
        int expected = 22;
        assertThat(answer).isEqualTo(expected);
    }
}
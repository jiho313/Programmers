package level1.나머지가1이되는수찾기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int n = 10;
        Solution solution = new Solution();
        int answer = solution.solution(n);
        int expected = 3;
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int n = 12;
        Solution solution = new Solution();
        int answer = solution.solution(n);
        int expected = 11;
        assertThat(answer).isEqualTo(expected);
    }



}
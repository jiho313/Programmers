package level0.피자나눠먹기3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int slice = 7;
        int n = 10;
        Solution solution = new Solution();
        int answer = solution.solution(slice, n);
        int expected = 2;
        assertThat(answer).isEqualTo(expected);
    }
    @Test
    void solution2() {
        int slice = 4;
        int n = 12;
        Solution solution = new Solution();
        int answer = solution.solution(slice, n);
        int expected = 3;
        assertThat(answer).isEqualTo(expected);
    }
}
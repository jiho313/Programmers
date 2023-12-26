package level0.피자나눠먹기1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int n = 7;
        int result = 1;
        Solution solution = new Solution();
        int answer = solution.solution(n);
        Assertions.assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution2() {
        int n = 1;
        int result = 1;
        Solution solution = new Solution();
        int answer = solution.solution(n);
        Assertions.assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution3() {
        int n = 15;
        int result = 3;
        Solution solution = new Solution();
        int answer = solution.solution(n);
        Assertions.assertThat(answer).isEqualTo(result);
    }

}
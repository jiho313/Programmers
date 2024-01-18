package level1.약수의합;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution1() {
        int n = 12;
        Solution solution = new Solution();
        int answer = solution.solution1(n);
        int expected = 28;
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int n = 5;
        Solution solution = new Solution();
        int answer = solution.solution1(n);
        int expected = 6;
        Assertions.assertThat(answer).isEqualTo(expected);
    }

}
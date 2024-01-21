package level1.최대공약수와최소공배수;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int n = 3;
        int m = 12;
        Solution solution = new Solution();
        int[] answer = solution.solution(n, m);
        int[] expected = {3, 12};
        Assertions.assertThat(answer).isEqualTo(expected);
    }
    @Test
    void solution2() {
        int n = 2;
        int m = 5;
        Solution solution = new Solution();
        int[] answer = solution.solution(n, m);
        int[] expected = {1, 10};
        Assertions.assertThat(answer).isEqualTo(expected);
    }
}
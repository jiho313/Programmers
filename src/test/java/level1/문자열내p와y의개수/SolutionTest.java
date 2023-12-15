package level1.문자열내p와y의개수;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        Solution solution = new Solution();
        String s = "pPoooyY";
        boolean answer = solution.solution(s);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        String s = "Pyy";
        boolean answer = solution.solution(s);
        Assertions.assertThat(answer).isFalse();
    }

}
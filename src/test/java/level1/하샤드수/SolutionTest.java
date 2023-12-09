package level1.하샤드수;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        Solution solution = new Solution();
        int x = 10;
        boolean answer = solution.solution(x);
        assertThat(answer).isTrue();
    }
    @Test
    void solution2() {
        Solution solution = new Solution();
        int x = 12;
        boolean answer = solution.solution(x);
        assertThat(answer).isTrue();
    }
    @Test
    void solution3() {
        Solution solution = new Solution();
        int x = 11;
        boolean answer = solution.solution(x);
        assertThat(answer).isFalse();
    }
    @Test
    void solution4() {
        Solution solution = new Solution();
        int x = 13;
        boolean answer = solution.solution(x);
        assertThat(answer).isFalse();
    }

}
package level1.자릿수더하기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int n = 123;
        Solution solution = new Solution();
        int answer1 = solution.solution1(n);
        int answer2 = solution.solution2(n);
        int expected = 6;

        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
    @Test
    void solution2() {
        int n = 987;
        Solution solution = new Solution();
        int answer1 = solution.solution1(n);
        int answer2 = solution.solution2(n);
        int expected = 24;

        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

}
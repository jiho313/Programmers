package level1.내적;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        Solution solution = new Solution();
        int answer1 = solution.solution1(a, b);
        int answer2 = solution.solution2(a, b);
        int expected = 3;

        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[] a = {-1,0,1};
        int[] b = {1, 0, -1};

        Solution solution = new Solution();
        int answer1 = solution.solution1(a, b);
        int answer2 = solution.solution2(a, b);
        int expected = -2;

        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
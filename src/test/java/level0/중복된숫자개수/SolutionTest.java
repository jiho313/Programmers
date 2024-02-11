package level0.중복된숫자개수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        Solution solution = new Solution();
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int answer1 = solution.solution1(array, n);
        int answer2 = solution.solution2(array, n);
        int expected = 2;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int[] array = {0, 2, 3, 4};
        int n = 1;
        int answer1 = solution.solution1(array, n);
        int answer2 = solution.solution2(array, n);
        int expected = 0;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

}
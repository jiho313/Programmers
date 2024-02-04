package level0.n의배수고르기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        Solution solution = new Solution();
        int[] answer1 = solution.solution1(n, numlist);
        int[] answer2 = solution.solution1(n, numlist);
        int[] expected = {6, 9, 12};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int n = 5;
        int[] numlist = {1, 9, 3, 10, 13, 5};
        Solution solution = new Solution();
        int[] answer1 = solution.solution1(n, numlist);
        int[] answer2 = solution.solution1(n, numlist);
        int[] expected = {10, 5};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution3() {
        int n = 12;
        int[] numlist = {2, 100, 120, 600, 12, 12};
        Solution solution = new Solution();
        int[] answer1 = solution.solution1(n, numlist);
        int[] answer2 = solution.solution1(n, numlist);
        int[] expected = {120, 600, 12, 12};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
package level0.공배수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int number = 60;
        int n = 2;
        int m = 3;
        Solution solution = new Solution();
        int answer1 = solution.solution1(number, n, m);
        int answer2 = solution.solution2(number, n, m);
        int expected = 1;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int number = 55;
        int n = 10;
        int m = 5;
        Solution solution = new Solution();
        int answer1 = solution.solution1(number, n, m);
        int answer2 = solution.solution2(number, n, m);
        int expected = 0;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
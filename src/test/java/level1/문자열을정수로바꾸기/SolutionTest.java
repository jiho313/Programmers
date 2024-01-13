package level1.문자열을정수로바꾸기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        String s = "1234";
        Solution solution = new Solution();
        int answer1 = solution.solution1(s);
        int answer2 = solution.solution2(s);
        int expected = 1234;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        String s = "-1234";
        Solution solution = new Solution();
        int answer1 = solution.solution1(s);
        int answer2 = solution.solution2(s);
        int expected = -1234;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
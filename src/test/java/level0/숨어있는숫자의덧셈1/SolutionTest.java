package level0.숨어있는숫자의덧셈1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        String my_string = "aAb1B2cC34oOp";
        Solution solution = new Solution();
        int answer1 = solution.solution1(my_string);
        int answer2 = solution.solution2(my_string);
        int expected = 10;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        String my_string = "1a2b3c4d123";
        Solution solution = new Solution();
        int answer1 = solution.solution1(my_string);
        int answer2 = solution.solution2(my_string);
        int expected = 16;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
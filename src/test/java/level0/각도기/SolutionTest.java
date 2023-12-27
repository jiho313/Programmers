package level0.각도기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int angle = 70;
        Solution solution = new Solution();
        int answer1 = solution.solution1(angle);
        int answer2 = solution.solution2(angle);
        int expected = 1;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
    @Test
    void solution2() {
        int angle = 91;
        Solution solution = new Solution();
        int answer1 = solution.solution1(angle);
        int answer2 = solution.solution2(angle);
        int expected = 3;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
    @Test
    void solution3() {
        int angle = 180;
        Solution solution = new Solution();
        int answer1 = solution.solution1(angle);
        int answer2 = solution.solution2(angle);
        int expected = 4;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

}
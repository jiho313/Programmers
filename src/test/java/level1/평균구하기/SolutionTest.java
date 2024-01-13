package level1.평균구하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int[] arr = {1, 2, 3, 4};
        Solution solution = new Solution();
        double answer1 = solution.solution1(arr);
        double answer2 = solution.solution2(arr);
        double expected = 2.5;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[] arr = {5, 5};
        Solution solution = new Solution();
        double answer1 = solution.solution1(arr);
        double answer2 = solution.solution2(arr);
        double expected = 5;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

}
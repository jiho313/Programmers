package level0.첫번째로나오는음수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        Solution solution = new Solution();
        int answer1 = solution.solution1(num_list);
        int answer2 = solution.solution2(num_list);
        int expected = 5;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[] num_list = {13, 22, 53, 24, 15, 6};
        Solution solution = new Solution();
        int answer1 = solution.solution1(num_list);
        int answer2 = solution.solution2(num_list);
        int expected = -1;
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
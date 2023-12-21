package level0.뒤에서5등까지;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution() {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        Solution solution = new Solution();
        int[] answer = solution.solution(num_list);
        int[] expected = {1, 4, 12, 14, 15};
        assertThat(answer).isEqualTo(expected);
    }

}
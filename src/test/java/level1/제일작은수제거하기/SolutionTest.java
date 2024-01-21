package level1.제일작은수제거하기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int[] arr = {4, 3, 2, 1};
        Solution solution = new Solution();
        int[] answer1 = solution.solution1(arr);
        int[] answer2 = solution.solution2(arr);
        int[] expected = {4, 3, 2};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[] arr = {10};
        Solution solution = new Solution();
        int[] answer1 = solution.solution1(arr);
        int[] answer2 = solution.solution2(arr);
        int[] expected = {-1};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
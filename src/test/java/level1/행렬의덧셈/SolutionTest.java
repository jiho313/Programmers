package level1.행렬의덧셈;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        Solution solution = new Solution();
        int[][] answer1 = solution.solution1(arr1, arr2);
        int[][] answer2 = solution.solution2(arr1, arr2);
        int[][] expected = {{4, 6}, {7, 9}};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};
        Solution solution = new Solution();
        int[][] answer1 = solution.solution1(arr1, arr2);
        int[][] answer2 = solution.solution2(arr1, arr2);
        int[][] expected = {{4}, {6}};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
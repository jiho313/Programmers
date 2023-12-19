package level0.배열의원소만큼추가하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void solution1() {
        int[] arr = {5, 1, 4};
        Solution solution = new Solution();
        int[] answer = solution.solution(arr);
        int[] expected = {5, 5, 5, 5, 5, 1, 4, 4, 4, 4};
        assertArrayEquals(expected, answer);
    }
    void solution2() {
        int[] arr = {6, 6};
        Solution solution = new Solution();
        int[] answer = solution.solution(arr);
        int[] expected = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        assertArrayEquals(expected, answer);
    }
    void solution3() {
        int[] arr = {1};
        Solution solution = new Solution();
        int[] answer = solution.solution(arr);
        int[] expected = {1};
        assertArrayEquals(expected, answer);
    }

}
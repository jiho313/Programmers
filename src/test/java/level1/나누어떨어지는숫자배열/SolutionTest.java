package level1.나누어떨어지는숫자배열;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        Solution solution = new Solution();
        int[] arr = {5, 9, 7, 10};
        int[] expected = {5, 10};
        int divisor = 5;

        int[] answer1 = solution.solution1(arr, divisor);
        int[] answer2 = solution.solution2(arr, divisor);

        assertArrayEquals(expected, answer1);
        assertArrayEquals(expected, answer2);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int[] arr = {2, 36, 1, 3};
        int[] expected = {1, 2, 3, 36};
        int divisor = 1;

        int[] answer1 = solution.solution1(arr, divisor);
        int[] answer2 = solution.solution2(arr, divisor);

        assertArrayEquals(expected, answer1);
        assertArrayEquals(expected, answer2);
    }

    @Test
    void solution3() {
        Solution solution = new Solution();
        int[] arr = {3, 2, 6};
        int[] expected = {-1};
        int divisor = 10;

        int[] answer1 = solution.solution1(arr, divisor);
        int[] answer2 = solution.solution2(arr, divisor);

        assertArrayEquals(expected, answer1);
        assertArrayEquals(expected, answer2);
    }

}
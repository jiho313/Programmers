package level1.x만큼간격이있는n개의숫자;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int a = 2;
        int n = 5;
        Solution solution = new Solution();
        long[] answer = solution.solution(a, n);
        long[] expected = {2, 4, 6, 8, 10};
        assertArrayEquals(expected, answer);
    }
    @Test
    void solution2() {
        int a = 4;
        int n = 3;
        Solution solution = new Solution();
        long[] answer = solution.solution(a, n);
        long[] expected = {4, 8, 12};
        assertArrayEquals(expected, answer);
    }
    @Test
    void solution3() {
        int a = -4;
        int n = 2;
        Solution solution = new Solution();
        long[] answer = solution.solution(a, n);
        long[] expected = {-4, -8};
        assertArrayEquals(expected, answer);
    }
}
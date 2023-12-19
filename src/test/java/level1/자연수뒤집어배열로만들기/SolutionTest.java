package level1.자연수뒤집어배열로만들기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        long n = 12345;
        int[] answer = solution.solution(n);
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(answer, expected);
    }

}
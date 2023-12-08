package level0.분수의덧셈;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        Solution solution = new Solution();
        int[] answer = solution.solution1(1,2,3,4);
        int[] expected = {5, 4};

        assertArrayEquals(answer, expected);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        int[] answer = solution.solution1(9, 2, 1, 3);
        int[] expected = {29, 6};

        assertArrayEquals(answer, expected);
    }
    @Test
    void solution3() {
        Solution solution = new Solution();
        int[] answer = solution.solution2(1,2,3,4);
        int[] expected = {5, 4};

        assertArrayEquals(answer, expected);
    }

    @Test
    void solution4() {
        Solution solution = new Solution();
        int[] answer = solution.solution2(9, 2, 1, 3);
        int[] expected = {29, 6};

        assertArrayEquals(answer, expected);
    }

}
package level1.음양더하기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        Solution solution = new Solution();
        int answer = solution.solution(absolutes, signs);
        int expected = 9;
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};
        Solution solution = new Solution();
        int answer = solution.solution(absolutes, signs);
        int expected = 0;
        assertThat(answer).isEqualTo(expected);
    }



}
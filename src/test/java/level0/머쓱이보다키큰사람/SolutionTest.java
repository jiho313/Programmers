package level0.머쓱이보다키큰사람;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int[] array = {149, 180, 192, 170};
        int height = 167;
        Solution solution = new Solution();
        int answer = solution.solution(array, height);
        int expected = 3;
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int[] array = {180, 120, 140};
        int height = 190;
        Solution solution = new Solution();
        int answer = solution.solution(array, height);
        int expected = 0;
        Assertions.assertThat(answer).isEqualTo(expected);
    }

}
package level1.없는수더하기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        Solution solution = new Solution();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int answer = solution.solution(numbers);
        Assertions.assertThat(answer).isEqualTo(14);
    }
    @Test
    void solution2() {
        Solution solution = new Solution();
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};
        int answer = solution.solution(numbers);
        Assertions.assertThat(answer).isEqualTo(6);
    }

}
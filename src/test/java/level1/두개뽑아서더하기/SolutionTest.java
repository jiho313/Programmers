package level1.두개뽑아서더하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int[] numbers = {2, 1, 3, 4, 1};
        Solution solution = new Solution();
        int[] answer = solution.solution(numbers);
        int[] expected = {2, 3, 4, 5, 6, 7};
        assertThat(answer).isEqualTo(expected);
    }
    @Test
    void solution2() {
        int[] numbers = {5, 0, 2, 7};
        Solution solution = new Solution();
        int[] answer = solution.solution(numbers);
        int[] expected = {2, 5, 7, 9, 12};
        assertThat(answer).isEqualTo(expected);
    }
}
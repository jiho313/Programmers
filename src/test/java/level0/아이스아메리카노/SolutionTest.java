package level0.아이스아메리카노;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int money = 5500;
        Solution solution = new Solution();
        int[] answer = solution.solution(money);
        int[] expected = {1, 0};
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int money = 15000;
        Solution solution = new Solution();
        int[] answer = solution.solution(money);
        int[] expected = {2, 4000};
        assertThat(answer).isEqualTo(expected);
    }

}
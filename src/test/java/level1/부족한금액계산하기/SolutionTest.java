package level1.부족한금액계산하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        int price = 3;
        int money = 20;
        int count = 4;
        int result = 10;
        Solution solution = new Solution();
        long answer = solution.solution(price, money, count);
        assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution2() {
        int price = 3;
        int money = 50;
        int count = 4;
        int result = 0;
        Solution solution = new Solution();
        long answer = solution.solution(price, money, count);
        assertThat(answer).isEqualTo(result);
    }

}
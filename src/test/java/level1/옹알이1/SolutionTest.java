package level1.옹알이1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        Solution solution = new Solution();
        int answer = solution.solution(babbling);
        assertThat(answer).isEqualTo(1);
    }
    @Test
    void solution2() {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        Solution solution = new Solution();
        int answer = solution.solution(babbling);
        assertThat(answer).isEqualTo(3);
    }

}
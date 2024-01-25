package level1.가운데글자가져오기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        String s = "abcde";
        Solution solution = new Solution();
        String answer = solution.solution(s);
        String expected = "c";
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        String s = "qwer";
        Solution solution = new Solution();
        String answer = solution.solution(s);
        String expected = "we";
        assertThat(answer).isEqualTo(expected);
    }
}
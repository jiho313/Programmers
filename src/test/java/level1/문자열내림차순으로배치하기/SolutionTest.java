package level1.문자열내림차순으로배치하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        String s = "Zbcdefg";
        Solution solution = new Solution();
        String answer = solution.solution(s);
        String expected = "gfedcbZ";
        assertThat(answer).isEqualTo(expected);
    }
}
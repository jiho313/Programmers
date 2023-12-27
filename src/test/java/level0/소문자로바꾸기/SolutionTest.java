package level0.소문자로바꾸기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution1() {
        String myString = "aBcDeFg";
        Solution solution = new Solution();
        String answer = solution.solution(myString);
        String expected = "abcdefg";
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void solution2() {
        String myString = "aaa";
        Solution solution = new Solution();
        String answer = solution.solution(myString);
        String expected = "aaa";
        Assertions.assertThat(answer).isEqualTo(expected);
    }

}
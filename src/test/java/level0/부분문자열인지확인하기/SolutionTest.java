package level0.부분문자열인지확인하기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        String myString = "banana";
        String target = "ana";
        Solution solution = new Solution();
        int answer = solution.solution(myString, target);
        assertThat(answer).isEqualTo(1);
    }

    @Test
    void solution2() {
        String myString = "banana";
        String target = "wxyz";
        Solution solution = new Solution();
        int answer = solution.solution(myString, target);
        assertThat(answer).isZero();
    }

}
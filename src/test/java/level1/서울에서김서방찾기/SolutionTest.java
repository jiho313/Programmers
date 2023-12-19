package level1.서울에서김서방찾기;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution() {
        String[] seoul = {"Jane", "Kim"};
        Solution solution = new Solution();
        String answer = solution.solution(seoul);
        String expected = "김서방은 1에 있다";
        assertThat(answer).isEqualTo(expected);
    }

}
package level0.배열의유사도;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        Solution solution = new Solution();
        int answer = solution.solution(s1, s2);
        assertThat(answer).isEqualTo(2);
    }
    @Test
    void solution2() {
        String[] s1 = {"n", "omg"};
        String[] s2 = {"m", "dot"};
        Solution solution = new Solution();
        int answer = solution.solution(s1, s2);
        assertThat(answer).isEqualTo(0);
    }

}
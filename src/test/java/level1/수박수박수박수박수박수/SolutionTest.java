package level1.수박수박수박수박수박수;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void soluiton1() {
        int n = 3;
        Solution solution = new Solution();
        String answer1 = solution.soluiton1(n);
        String answer2 = solution.soluiton2(n);
        String expected = "수박수";
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void soluiton2() {
        int n = 4;
        Solution solution = new Solution();
        String answer1 = solution.soluiton1(n);
        String answer2 = solution.soluiton2(n);
        String expected = "수박수박";
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }
}
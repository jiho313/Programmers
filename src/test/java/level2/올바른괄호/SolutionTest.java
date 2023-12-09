package level2.올바른괄호;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solution1() {
        Solution solution = new Solution();
        boolean answer1 = solution.solution1("()()");
        boolean answer2 = solution.solution2("()()");

        assertThat(answer1).isTrue();
        assertThat(answer2).isTrue();
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        boolean answer1 = solution.solution1("(())()");
        boolean answer2 = solution.solution2("(())()");

        assertThat(answer1).isTrue();
        assertThat(answer2).isTrue();
    }

    @Test
    void solution3() {
        Solution solution = new Solution();
        boolean answer1 = solution.solution1(")()(");
        boolean answer2 = solution.solution2(")()(");

        assertThat(answer1).isFalse();
        assertThat(answer2).isFalse();
    }


    @Test
    void solution4() {
        Solution solution = new Solution();
        boolean answer1 = solution.solution1("(()(");
        boolean answer2 = solution.solution2("(()(");

        assertThat(answer1).isFalse();
        assertThat(answer2).isFalse();
    }

}
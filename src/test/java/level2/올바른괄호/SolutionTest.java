package level2.올바른괄호;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void solution1() {
        Solution solution = new Solution();
        boolean answer = solution.solution1("()()");
        Assertions.assertThat(answer).isTrue();
        System.out.println("answer = " + answer);
    }

    @Test
    void solution2() {
        Solution solution = new Solution();
        boolean answer = solution.solution1("(())()");
        Assertions.assertThat(answer).isTrue();
        System.out.println("answer = " + answer);
    }

    @Test
    void solution3() {
        Solution solution = new Solution();
        boolean answer = solution.solution1(")()(");
        Assertions.assertThat(answer).isFalse();
        System.out.println("answer = " + answer);
    }


    @Test
    void solution4() {
        Solution solution = new Solution();
        boolean answer = solution.solution1("(()(");
        Assertions.assertThat(answer).isFalse();
        System.out.println("answer = " + answer);
    }

    @Test
    void solution5() {
        Solution solution = new Solution();
        boolean answer = solution.solution2("()()");
        Assertions.assertThat(answer).isTrue();
        System.out.println("answer = " + answer);
    }

    @Test
    void solution6() {
        Solution solution = new Solution();
        boolean answer = solution.solution2("(())()");
        Assertions.assertThat(answer).isTrue();
        System.out.println("answer = " + answer);
    }

    @Test
    void solution7() {
        Solution solution = new Solution();
        boolean answer = solution.solution2(")()()(");
        Assertions.assertThat(answer).isFalse();
        System.out.println("answer = " + answer);
    }

    @Test
    void solution8() {
        Solution solution = new Solution();
        boolean answer = solution.solution2("(()(");
        Assertions.assertThat(answer).isFalse();
        System.out.println("answer = " + answer);
    }




}
package level0.약수구하기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution1() {
        int n = 24;
        Solution solution = new Solution();
        int[] answer1 = solution.solution1(n);
        int[] answer2 = solution.solution2(n);
        int[] expected = {1, 2, 3, 4, 6, 8, 12, 24};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }

    @Test
    void solution2() {
        int n = 29;
        Solution solution = new Solution();
        int[] answer1 = solution.solution1(n);
        int[] answer2 = solution.solution2(n);
        int[] expected = {1, 29};
        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(expected);
    }



}
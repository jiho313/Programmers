package level0.첫번째로나오는음수;

import java.util.stream.IntStream;

public class Solution {

    public int solution1(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }
    public int solution2(int[] num_list) {
        return IntStream.range(0, num_list.length)
                .filter(i -> num_list[i] < 0)
                .findFirst()
                .orElse(-1);
    }
}

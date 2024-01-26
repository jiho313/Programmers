package level0.짝수의합;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    public int solution1(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i+=2) {
            answer += i;
        }
        return answer;
    }
    public int solution2(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).sum();
    }
}

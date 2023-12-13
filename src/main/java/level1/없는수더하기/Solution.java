package level1.없는수더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int solution1(int[] numbers) {
        int answer = 0;
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = new ArrayList<>();
        for (int n : num) list.add(n);
        for (int n : numbers) list.remove(Integer.valueOf(n));
        for (int n : list) answer += n;
        return answer;
    }
    public int solution2(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

}

package level0.약수구하기;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Solution {

    public int[] solution1(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution2(int n) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                set.add(i);
                if (i != n / i) {
                    set.add(n / i);
                }
            }
        }
        return set.stream().mapToInt(i -> i).toArray();
    }
}

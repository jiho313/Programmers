package level1.자릿수더하기;

public class Solution {

    public int solution1(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        String[] st = String.valueOf(n).split("");
        for (String s : st) {
            answer += Integer.valueOf(s);
        }
        return answer;
    }
}

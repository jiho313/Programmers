package level1.자연수뒤집어배열로만들기;

public class Solution {

    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
        String[] sts = sb.toString().split("");
        int[] answer = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            answer[i] = Integer.valueOf(sts[i]);
        }
        return answer;
    }
}

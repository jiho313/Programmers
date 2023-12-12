package level1.옹알이1;

public class Solution {

    public int solution(String[] babbling) {
        int answer = 0;
        for (String word : babbling) {
            if (word.matches("(aya|ye|woo|ma)*")) {
                answer ++;
            }
        }
        return answer;
    }
}

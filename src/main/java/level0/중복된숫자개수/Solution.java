package level0.중복된숫자개수;

public class Solution {

    public int solution1(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) {
                answer++;
            }
        }
        return answer;
    }

}

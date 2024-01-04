package level0.머쓱이보다키큰사람;

public class Solution {

    public int solution(int[] array, int height) {
        int count = 0;
        for (int i : array) if(i > height) count ++;
        return count;
    }
}

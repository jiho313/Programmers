package level1.문자열내p와y의개수;

public class Solution {

    public boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'P' || ch == 'p') {
                pCount ++;
            } else if (ch == 'y' || ch == 'Y') {
                yCount ++;
            }
        }
        return pCount == yCount;
    }
}

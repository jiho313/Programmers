package level1.문자열다루기기본;

public class Solution {

    public boolean solution1(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 47 || c > 58) return false;
        }
        return s.length() == 4 || s.length() == 6;
    }

    public boolean solution2(String s) {
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) return false;
        }
        return s.length() == 4 || s.length() == 6;
    }
}

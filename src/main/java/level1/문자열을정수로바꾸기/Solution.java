package level1.문자열을정수로바꾸기;

public class Solution {

    public int solution1(String s) {
        return Integer.parseInt(s);
    }

    public int solution2(String s) {
        return Integer.valueOf(s);
    }
}

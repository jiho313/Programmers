package level1.가운데글자가져오기;

public class Solution {

    public String solution(String s) {
        int length = s.length();
        int index = length / 2;
        return length % 2 == 0 ? s.substring(index - 1, index + 1) : s.substring(index, index + 1);
    }
}

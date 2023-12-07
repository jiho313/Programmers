package level2.올바른괄호;

import java.util.Stack;

public class Solution {

    public boolean solution1(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
            } else {
                count --;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

    public boolean solution2(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push('(');
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}

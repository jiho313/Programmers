package level1.수박수박수박수박수박수;

public class Solution {

    public String soluiton1(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) answer.append((i % 2 == 0) ? "수" : "박");
        return answer.toString();
    }

    public String soluiton2(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) answer += (i % 2 == 0) ? "수" : "박";
        return answer;
    }
}

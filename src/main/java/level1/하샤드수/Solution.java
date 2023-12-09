package level1.하샤드수;

public class Solution {

    public boolean solution(int x) {
        int sum = 0;
        String[] sts = String.valueOf(x).split("");
        for (String st : sts) {
            sum += Integer.valueOf(st);
        }
        return x % sum == 0;
    }
}

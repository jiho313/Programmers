package level0.공배수;

public class Solution {

    public int solution1(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int solution2(int number, int n, int m) {
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}

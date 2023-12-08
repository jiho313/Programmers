package level0.분수의덧셈;

public class Solution {

    public int[] solution1(int numer1, int denom1, int numer2, int denom2) {
        int newNumer = numer1 * denom2 + numer2 * denom1;
        int newDenom = denom1 * denom2;
        int gcd = gcd1(newNumer, newDenom);
        return new int[]{(newNumer / gcd), (newDenom / gcd)};
    }

    private int gcd1(int a, int b) {
        return a % b == 0 ? b : gcd1(b, a % b);
    }

    public int[] solution2(int numer1, int denom1, int numer2, int denom2) {
        int newNumer = numer1 * denom2 + numer2 * denom1;
        int newDenom = denom1 * denom2;
        int gcd = gcd2(newNumer, newDenom);
        return new int[]{(newNumer / gcd), (newDenom / gcd)};
    }

    private int gcd2(int a, int b) {
        while(b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

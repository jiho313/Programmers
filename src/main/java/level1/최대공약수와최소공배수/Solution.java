package level1.최대공약수와최소공배수;

public class Solution {

    public int[] solution(int n, int m) {
        return new int[] {gcd(n, m), lcm(n, m)};
    }

    private int gcd(int n, int m) {
        return n % m == 0 ? m : gcd(m, n % m);
    }

    private int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }
}

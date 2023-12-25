package level1.부족한금액계산하기;

public class Solution {

    public long solution(int price, int money, int count) {
        long needMoney = 0;
        for (int i = 0; i <= count; i++) {
            needMoney += price * i;
        }
        return (needMoney - money > 0) ? (needMoney - money) : 0;
    }
}

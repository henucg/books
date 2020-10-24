package main.设计模式之禅.chapter18.demo04;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 08:04
 */
public class Test01 {
    public static void main(String[] args) {
        int payType = 2;
        int money = 12;

        PayEnum.of(payType).pay(money);
    }
}

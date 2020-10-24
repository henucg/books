package main.设计模式之禅.chapter18.demo05;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 08:17
 */
public class Test01 {
    public static void main(String[] args) {
        int payType = 2;
        int money = 12 ;

        PayStatregy payStatregy = PayEnumFactory.of(payType).buildPay();
        new PayContext(payStatregy).executePay(money);
    }
}

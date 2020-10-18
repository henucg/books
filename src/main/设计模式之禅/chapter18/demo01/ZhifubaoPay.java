package main.设计模式之禅.chapter18.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 15:02
 */
public class ZhifubaoPay implements PayStatregy {
    @Override
    public void pay(int money) {
        System.out.println("支付宝支付"+money+"元");
    }
}

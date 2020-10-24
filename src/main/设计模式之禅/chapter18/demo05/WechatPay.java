package main.设计模式之禅.chapter18.demo05;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 08:07
 */
public class WechatPay implements PayStatregy {
    @Override
    public void pay(int money) {
        System.out.println("微信支付"+money+"元");
    }
}

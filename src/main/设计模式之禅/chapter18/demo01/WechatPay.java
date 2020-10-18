package main.设计模式之禅.chapter18.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 15:01
 */
public class WechatPay implements PayStatregy {
    @Override
    public void pay(int money) {
        System.out.println("微信支付"+money+"元");
    }
}

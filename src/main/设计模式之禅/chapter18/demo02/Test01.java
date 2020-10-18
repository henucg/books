package main.设计模式之禅.chapter18.demo02;

/**
 * @author cg
 * @description Lambada 实现策略模式
 * @date 2020-10-18 15:09
 */
public class Test01 {
    public static void main(String[] args) {

        PayContext wechatPayContext = new PayContext((int money)->{
            System.out.println("微信支付"+money+"元");
        });
        wechatPayContext.executePay(9);

        PayContext zhifubaoPayContext = new PayContext((int  money)->{
            System.out.println("支付宝支付"+money+"元");
        });
        zhifubaoPayContext.executePay(12);
    }
}

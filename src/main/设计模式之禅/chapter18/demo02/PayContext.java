package main.设计模式之禅.chapter18.demo02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 15:11
 */
public class PayContext {

    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy){
        this.payStrategy = payStrategy;
    }

    public void executePay(int money){
        this.payStrategy.pay(money);
    }
}

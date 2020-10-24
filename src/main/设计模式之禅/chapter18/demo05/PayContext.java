package main.设计模式之禅.chapter18.demo05;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 08:08
 */
public class PayContext {

    private PayStatregy payStatregy;

    public PayContext(PayStatregy payStatregy){
        this.payStatregy = payStatregy;
    }

    public void executePay(int money){
        this.payStatregy.pay(money);
    }
}

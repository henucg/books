package main.设计模式之禅.chapter18.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 15:03
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

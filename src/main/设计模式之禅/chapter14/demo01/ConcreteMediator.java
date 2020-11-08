package main.设计模式之禅.chapter14.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-11-08 11:03
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void send(String msg) {
        super.getUser1().sendMessage(msg);
        super.getUser2().sendMessage(msg);
    }

    @Override
    public void get() {
        super.getUser1().getMessage();
        super.getUser2().getMessage();
    }
}

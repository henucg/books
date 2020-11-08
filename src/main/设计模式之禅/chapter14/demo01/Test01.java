package main.设计模式之禅.chapter14.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-11-08 11:34
 */
public class Test01 {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        User1 user1 = new User1(mediator);
        User2 user2 = new User2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);

        mediator.send("java");
        mediator.get();
    }
}

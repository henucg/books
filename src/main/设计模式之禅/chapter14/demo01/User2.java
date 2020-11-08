package main.设计模式之禅.chapter14.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-11-08 11:28
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("User2发送消息：" + msg);
    }

    @Override
    public void getMessage() {
        System.out.println("User2接收消息");
    }
}

package main.设计模式之禅.chapter14.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-11-08 11:04
 */
public class User1 extends User {
    private Mediator mediator;

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("User1发送消息："+msg);
    }

    @Override
    public void getMessage() {
        System.out.println("User1接收消息");
    }
}

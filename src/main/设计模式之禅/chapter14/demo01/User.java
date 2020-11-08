package main.设计模式之禅.chapter14.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-11-08 10:58
 */
public abstract class User {

    private Mediator mediator;

    public User(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void sendMessage(String msg);

    public abstract void getMessage();
}

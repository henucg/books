package main.设计模式之禅.chapter14.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-11-08 11:00
 */
public abstract class Mediator {

    private User1 user1;
    private User2 user2;

    public User1 getUser1() {
        return user1;
    }

    public void setUser1(User1 user1) {
        this.user1 = user1;
    }

    public User2 getUser2() {
        return user2;
    }

    public void setUser2(User2 user2) {
        this.user2 = user2;
    }

    public abstract void send(String msg);

    public abstract void get();

}

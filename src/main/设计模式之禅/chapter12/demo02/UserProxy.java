package main.设计模式之禅.chapter12.demo02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-31 22:27
 */
public class UserProxy implements Proxy,UserService {
    private UserService userService ;

    public UserProxy(UserService userService){
        this.userService = userService;
    }

    @Override
    public void doBefore() {
        System.out.println("前置事务");
    }

    @Override
    public void doAfter() {
        System.out.println("后置事务");
    }

    @Override
    public void add() {
        this.doBefore();
        this.userService.add();
        this.doAfter();
    }

    @Override
    public void setProxy() {
    }
}

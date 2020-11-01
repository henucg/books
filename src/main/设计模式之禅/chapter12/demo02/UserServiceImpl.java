package main.设计模式之禅.chapter12.demo02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-31 22:26
 */
public class UserServiceImpl implements UserService {
    private Proxy proxy;

    public UserServiceImpl(){}

    @Override
    public void add() {
        if(this.proxy!=null) {
            System.out.println("add user");
        }else{
            System.out.println("请使用代理访问");
        }
    }

    @Override
    public void setProxy() {
        this.proxy = new UserProxy(this);
    }
}

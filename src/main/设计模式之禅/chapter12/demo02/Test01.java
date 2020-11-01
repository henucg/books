package main.设计模式之禅.chapter12.demo02;

/**
 * @author cg
 * @description 强制代理模式
 * @date 2020-10-31 22:39
 */
public class Test01 {

    public static void main(String[] args) {
        // 直接访问，被拒绝
        UserService userService = new UserServiceImpl();
        userService.add();

        // 直接访问，设置代理，通过代理访问成功
        userService.setProxy();
        UserProxy proxy = new UserProxy(userService);
        proxy.add();
    }
}

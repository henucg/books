package main.设计模式之禅.chapter12.demo03;

import java.lang.reflect.InvocationHandler;

/**
 * @author cg
 * @description desc
 * @date 2020-10-31 23:11
 */
public class Test01 {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        InvocationHandler handler = new UserInvocationHandler(userService);

        UserService proxy = DynamicProxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                handler);

        proxy.add();
    }
}

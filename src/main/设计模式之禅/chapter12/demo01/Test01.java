package main.设计模式之禅.chapter12.demo01;

/**
 * @author cg
 * @description 简单代理模式
 * @date 2020-10-31 22:22
 */
public class Test01 {
    public static void main(String[] args) {
        UserProxy proxy = new UserProxy(new UserServiceImpl());
        proxy.add();
    }
}

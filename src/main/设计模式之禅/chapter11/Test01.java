package main.设计模式之禅.chapter11;

/**
 * @author cg
 * @description 建造者模式
 * @date 2020-10-31 20:38
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(new Director(new OfoBuilder()).construct());

        System.out.println(new Director(new MobikeBuilder()).construct());
    }
}

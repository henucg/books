package main.设计模式之禅.chapter08.demo01;

/**
 * @author cg
 * @description 简单工厂模式
 * @date 2020-10-24 10:12
 */
public class Test01 {

    public static void main(String[] args) {
        HumanFactory.createHuman(BlackHuman.class).say();

        HumanFactory.createHuman(YellowHuman.class).say();

        HumanFactory.createHuman(WriteHuman.class).say();
    }
}

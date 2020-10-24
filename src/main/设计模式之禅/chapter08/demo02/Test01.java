package main.设计模式之禅.chapter08.demo02;

/**
 * @author cg
 * @description 工厂方法模式
 * @date 2020-10-24 10:21
 */
public class Test01 {
    public static void main(String[] args) {
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();

        abstractHumanFactory.createHuman(YellowHuman.class).say();
    }
}

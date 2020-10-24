package main.设计模式之禅.chapter08.demo03;

/**
 * @author cg
 * @description 抽象工厂模式
 * @date 2020-10-24 21:09
 */
public class Test01 {

    public static void main(String[] args) {
        HumanFactory.buildHuman(YellowHuman.class).say();
        HumanFactory.buildSex(Female.class).printSex();
    }
}

package main.设计模式之禅.chapter07.demo01;

/**
 * @author cg
 * @description 饿汉模式
 * @date 2020-10-24 08:37
 */
public class SingleTon {
    private static final SingleTon singleTon = new SingleTon();

    private SingleTon(){}

    public static SingleTon getSingleTon(){
        return singleTon;
    }
}

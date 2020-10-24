package main.设计模式之禅.chapter07.demo05;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 09:13
 */
public class SingleTon {

    private SingleTon(){}

    public static class InnerHolder{
        private static SingleTon singleTon = new SingleTon();
    }

    public static SingleTon getSingleton(){
        return InnerHolder.singleTon;
    }
}

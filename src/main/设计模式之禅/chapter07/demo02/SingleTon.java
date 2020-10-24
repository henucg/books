package main.设计模式之禅.chapter07.demo02;

/**
 * @author cg
 * @description 懒汉模式
 * @date 2020-10-24 08:40
 */
public class SingleTon {

    private static SingleTon singleTon = null ;

    private SingleTon(){}

    public static SingleTon getSingleTon(){
        if(singleTon==null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}

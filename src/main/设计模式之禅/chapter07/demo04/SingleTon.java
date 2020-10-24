package main.设计模式之禅.chapter07.demo04;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 09:06
 */
public class SingleTon {

    private static SingleTon singleTon = null;

    private SingleTon(){}

    public static SingleTon getSingleTon(){
        if(singleTon==null){
            synchronized (SingleTon.class){
                if(singleTon==null){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}

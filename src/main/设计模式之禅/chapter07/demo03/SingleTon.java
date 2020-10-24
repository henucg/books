package main.设计模式之禅.chapter07.demo03;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 08:51
 */
public class SingleTon {

    private static SingleTon singleTon = null ;

    private SingleTon(){}

    public static synchronized SingleTon getSingleTon(){
        if(singleTon==null){
            singleTon = new SingleTon();
        }

        return singleTon;
    }
}

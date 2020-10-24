package main.设计模式之禅.chapter07.demo02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 08:42
 */
public class Test01 {
    public static void main(String[] args) {
        SingleTon singleTon1 = SingleTon.getSingleTon();

        SingleTon singleTon2 = SingleTon.getSingleTon();

        System.out.println(singleTon1==singleTon2);
    }
}

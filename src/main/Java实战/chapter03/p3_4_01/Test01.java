package main.Java实战.chapter03.p3_4_01;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author cg
 * @description desc
 * @date 2020-09-13 20:03
 */
public class Test01 {
    public static void main(String[] args) {
        filter("hello",(String str)->"A".equals("a"));
    }

    public static <T> void filter(T t, Predicate<T> p){
        if(p.test(t)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }
}

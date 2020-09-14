package main.Java实战.chapter03.p3_5_02;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;

/**
 * @author cg
 * @description desc
 * @date 2020-09-13 21:07
 */
public class Test01 {
    public static void main(String[] args) {
        Comparator<String> c1 = (String s1,String s2)-> s1.compareTo(s2);

        ToIntBiFunction<String,String> c2 = (String s1,String s2)->s1.compareTo(s2);

        BiFunction<String,String,Integer> c3 = (String s1,String s2)->s1.compareTo(s2);

        Object object = (Runnable)()-> {System.out.println("hello");};
    }
}

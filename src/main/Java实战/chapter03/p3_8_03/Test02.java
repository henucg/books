package main.Java实战.chapter03.p3_8_03;

import java.util.function.Function;

/**
 * @author cg
 * @description desc
 * @date 2020-09-15 07:10
 */
public class Test02 {
    public static void main(String[] args) {
        Function<Integer,Integer> f = x -> x + 1 ;
        Function<Integer,Integer> g = x -> x * 2 ;
        Function<Integer,Integer> h = f.compose(g);

        System.out.println(f.apply(3));
        System.out.println(g.apply(4));
        System.out.println(h.apply(3));
    }
}

package main.Java实战.chapter05.p5_7_02;

import java.util.stream.IntStream;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 09:57
 */
public class Test01 {
    public static void main(String[] args) {
        // range 左闭右开
        System.out.println(
                IntStream.range(1,10).count()
        );

        // rangeClosed 左闭右闭
        System.out.println(
                IntStream.rangeClosed(1,10).count()
        );

        System.out.println(
                IntStream.rangeClosed(1,10)
                    .filter(i->i%2==0).count()
        );
    }
}

package main.Java实战.chapter07.p7_1_01;

import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 18:48
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(
                Stream.iterate(1L,i->i+1)
                    .limit(100)
                    .parallel()
                    .reduce(0L,Long::sum)
        );
    }
}

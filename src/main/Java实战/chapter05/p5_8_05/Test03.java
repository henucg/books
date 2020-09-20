package main.Java实战.chapter05.p5_8_05;

import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 11:14
 */
public class Test03 {
    public static void main(String[] args) {
        // 无限流限制
        Stream.iterate(0,n->n<100,n->n+1).forEach(System.out::println);

        // 等效于
        Stream.iterate(0,n->n+1).takeWhile(n->n<100).forEach(System.out::println);
    }
}

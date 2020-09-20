package main.Java实战.chapter05.p5_8_05;

import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 11:04
 */
public class Test01 {
    public static void main(String[] args) {
        // 创建无限流（偶数流）
        Stream.iterate(0,n->n+2).limit(10).forEach(System.out::println);
    }
}

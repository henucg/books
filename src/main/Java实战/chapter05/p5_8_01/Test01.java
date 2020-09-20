package main.Java实战.chapter05.p5_8_01;

import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 10:38
 */
public class Test01 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Hello","Bye","Miss");

        stringStream.map(String::toUpperCase).forEach(System.out::println);
    }
}

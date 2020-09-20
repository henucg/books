package main.Java实战.chapter05.p5_8_02;

import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 10:45
 */
public class Test01 {
    public static void main(String[] args) {
        Stream<String> values = Stream.of("k1","k2","k3")
                .flatMap(k->Stream.ofNullable(System.getProperty(k)));
    }
}

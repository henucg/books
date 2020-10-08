package main.Java实战.chapter08.p8_1_01;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:18
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> list = Stream.of("apple","orangle","pear").collect(Collectors.toList());

        System.out.println(list);
    }
}

package main.Java实战.chapter05.p5_3_01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 17:24
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("324","fsa","s","adfas","fasfsfsfsdf");

        List<Integer> stringLengths = stringList.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(stringLengths);
    }
}

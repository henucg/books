package main.Java实战.chapter05.p5_3_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 17:52
 */
public class Test02 {
    public static void main(String[] args) {
        String[] words = {"Hello","World"};
        List<String> strings = Arrays.stream(words)
                .map(w->w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(strings);
    }
}

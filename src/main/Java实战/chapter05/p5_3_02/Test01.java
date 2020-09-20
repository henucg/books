package main.Java实战.chapter05.p5_3_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 17:47
 */
public class Test01 {
    public static void main(String[] args) {
        // 尝试合并每个单词并去重
        String[] words = {"Hello","World"};
        List<String[]> strings = Arrays.stream(words).map(w->w.split(""))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(strings);
    }
}

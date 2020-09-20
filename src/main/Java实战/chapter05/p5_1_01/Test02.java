package main.Java实战.chapter05.p5_1_01;

import java.util.Arrays;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 16:26
 */
public class Test02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,7,9,2,4,6,8,10,2,4,12);

        numbers.stream()
                .filter(i->(i%2)==0)
                .distinct()
                .forEach(System.out::println);
    }
}

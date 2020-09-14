package main.Java实战.chapter03.p3_8_01;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @author cg
 * @description desc
 * @date 2020-09-15 06:47
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,2,43,23,5,9,7);

        list.sort(comparing(Integer::intValue).reversed());

        System.out.println(list);
    }
}

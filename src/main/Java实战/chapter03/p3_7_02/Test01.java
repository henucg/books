package main.Java实战.chapter03.p3_7_02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-14 22:35
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,2,43,23,5,9,7);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
    }
}

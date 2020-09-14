package main.Java实战.chapter03.p3_7_01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-14 22:28
 */
public class Test01 implements Comparator<Integer> {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,2,43,23,5,9,7);

        list.sort(new Test01());

        System.out.println(list);
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

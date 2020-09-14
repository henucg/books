package main.Java实战.chapter03.p3_7_03;

import java.util.Arrays;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-14 22:43
 */
public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,2,43,23,5,9,7);
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);
    }
}

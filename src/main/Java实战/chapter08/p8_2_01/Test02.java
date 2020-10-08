package main.Java实战.chapter08.p8_2_01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:39
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orangle");

        list.removeIf(s->"apple".equals(s));

        System.out.println(list);
    }
}

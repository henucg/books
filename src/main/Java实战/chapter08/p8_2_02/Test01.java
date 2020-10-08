package main.Java实战.chapter08.p8_2_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:41
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orangle");

        list.replaceAll(s->s.toUpperCase());

        System.out.println(list);
    }
}

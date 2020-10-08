package main.Java实战.chapter08.p8_2_01;

import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:36
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = List.of("apple","orangle");

        // list.of 创建的是定长的数组，不可以做CUD操作
        //list.removeIf(s->"apple".equals(s));

        System.out.println(list);
    }
}

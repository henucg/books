package main.Java实战.chapter08.p8_1_01;

import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:15
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = List.of("apple","orangle","pear");

        // List.of() 创建的是一个定长的数组，因此不可以做add/set操作
        //list.add("a");

        System.out.println(list);
    }
}

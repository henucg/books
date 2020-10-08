package main.Java实战.chapter08.p8_1_02;

import java.util.Set;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:21
 */
public class Test01 {
    public static void main(String[] args) {
        // 包好重复数据的时候回抛出：IllegalArgumentException
        Set<String> set = Set.of("apple","apple2","orangle");

        System.out.println(set);
    }
}

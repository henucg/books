package main.Java实战.chapter08.p8_1_03;

import java.util.Map;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:25
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.ofEntries(
                Map.entry("tom",16),
                Map.entry("jane",18),
                Map.entry("jack",6)
        );

        System.out.println(map);
    }
}

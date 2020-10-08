package main.Java实战.chapter08.p8_3_03;

import java.util.Map;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:57
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("tom",12,"jack",6,"jane",8);

        System.out.println(map.getOrDefault("susan",9));
    }
}

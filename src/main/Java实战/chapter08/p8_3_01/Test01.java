package main.Java实战.chapter08.p8_3_01;

import java.util.Map;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:46
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("tom",12,"jack",13);

        map.forEach((k,v)-> System.out.println(k+","+v));
    }
}

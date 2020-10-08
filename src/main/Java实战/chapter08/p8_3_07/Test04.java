package main.Java实战.chapter08.p8_3_07;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cg
 * @description desc
 * @date 2020-10-09 07:37
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",5);
        map.put("B",10);

        map.entrySet().removeIf(e -> e.getValue()>5);

        System.out.println(map);
    }
}

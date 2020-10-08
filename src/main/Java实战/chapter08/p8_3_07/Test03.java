package main.Java实战.chapter08.p8_3_07;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cg
 * @description desc
 * @date 2020-10-09 07:23
 */
public class Test03 {
    public static void main(String[] args) {
        Map<String,Long> map = new HashMap<>();
        map.put("A",3L);

        String key = "A";
        Long count = map.get(key);

        map.merge(key,count,(k,v)->v+1L);

        System.out.println(map);
    }
}

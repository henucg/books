package main.Java实战.chapter08.p8_3_07;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cg
 * @description desc
 * @date 2020-10-09 07:19
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String,String> family = Map.ofEntries(
                Map.entry("Jack","China"),
                Map.entry("Tom","American")
        );

        Map<String,String> friend = Map.ofEntries(
                Map.entry("Jane","Cannada"),
                Map.entry("Tom","England")
        );

        Map<String,String> map = new HashMap<>(family);

        friend.forEach(
                (k,v)->map.merge(k,v,(v1,v2)->v1+"&"+v2)
        );

        System.out.println(map);
    }
}

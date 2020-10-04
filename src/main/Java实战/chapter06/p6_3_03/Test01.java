package main.Java实战.chapter06.p6_3_03;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import main.Java实战.chapter06.Type;

import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 10:28
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Type,Long> map = DataList.meau.stream()
                .collect(groupingBy(Dish::getType,counting()));

        System.out.println(map);
    }
}

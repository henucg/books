package main.Java实战.chapter06.p6_3_03;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import main.Java实战.chapter06.Type;

import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingLong;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 11:18
 */
public class Test04 {
    public static void main(String[] args) {
        Map<Type,Long> map = DataList.meau.stream()
                .collect(groupingBy(Dish::getType,summingLong(Dish::getCalories)));

        System.out.println(map);
    }
}

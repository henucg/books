package main.Java实战.chapter06.p6_3_03;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import main.Java实战.chapter06.Type;

import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 10:33
 */
public class Test02 {
    public static void main(String[] args) {
        Map<Type, Optional<Dish>> map = DataList.meau.stream()
                .collect(groupingBy(Dish::getType,maxBy(comparingInt(Dish::getCalories))));

        System.out.println(map);
    }
}

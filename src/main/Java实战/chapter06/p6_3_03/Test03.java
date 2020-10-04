package main.Java实战.chapter06.p6_3_03;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import main.Java实战.chapter06.Type;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 10:39
 */
public class Test03 {
    public static void main(String[] args) {
        Map<Type,Dish> map = DataList.meau.stream()
                .collect(groupingBy(Dish::getType,
                        collectingAndThen(
                                maxBy(comparingInt(Dish::getCalories)),
                                Optional::get
                        )));

        System.out.println(map);
    }
}

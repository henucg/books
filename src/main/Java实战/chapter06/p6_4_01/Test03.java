package main.Java实战.chapter06.p6_4_01;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 11:46
 */
public class Test03 {
    public static void main(String[] args) {
        Map<Boolean, Dish> map = DataList.meau.stream()
                .collect(partitioningBy(Dish::getVegetarain,
                        collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(map);
    }
}

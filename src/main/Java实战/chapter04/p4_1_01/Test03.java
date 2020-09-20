package main.Java实战.chapter04.p4_1_01;

import main.Java实战.chapter04.DataList;
import main.Java实战.chapter04.Dish;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 10:21
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> lowCaloricDishNames = DataList.meau.parallelStream()
                .filter(d->d.getCalories()<400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());

        System.out.println(lowCaloricDishNames);
    }
}

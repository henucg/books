package main.Java实战.chapter05.p5_2_02;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 16:52
 */
public class Test01 {
    public static void main(String[] args) {
        List<Dish> dishes = DataList.meau.stream()
                .filter(d->d.getCalories()<500)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(dishes);
    }
}

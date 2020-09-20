package main.Java实战.chapter04.p4_3_01;

import main.Java实战.chapter04.DataList;
import main.Java实战.chapter04.Dish;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 10:43
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = DataList.meau.stream()
                .filter(d->d.getCalories()>400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());

        System.out.println(list);
    }
}

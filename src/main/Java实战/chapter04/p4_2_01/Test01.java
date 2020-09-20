package main.Java实战.chapter04.p4_2_01;

import main.Java实战.chapter04.DataList;
import main.Java实战.chapter04.Dish;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 10:28
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = DataList.meau.stream()
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .limit(3)
                .collect(toList());

        System.out.println(list);
    }
}

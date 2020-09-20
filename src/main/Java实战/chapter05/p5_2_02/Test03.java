package main.Java实战.chapter05.p5_2_02;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 17:08
 */
public class Test03 {
    public static void main(String[] args) {
        List<Dish> dishes = DataList.meau.stream()
                .dropWhile(dish -> dish.getCalories()<300)
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(dishes);
    }
}

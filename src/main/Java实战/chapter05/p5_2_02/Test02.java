package main.Java实战.chapter05.p5_2_02;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 16:55
 */
public class Test02 {
    public static void main(String[] args) {
        List<Dish> dishes1 = DataList.meau.stream()
                .dropWhile(d->d.getCalories()>300)
                .collect(Collectors.toList());

        System.out.println(dishes1);


        System.out.println("-------------------");

        List<Dish> dishes2 = DataList.meau.stream()
                .filter(d->d.getCalories()>300)
                .collect(Collectors.toList());

        System.out.println(dishes2);
    }
}

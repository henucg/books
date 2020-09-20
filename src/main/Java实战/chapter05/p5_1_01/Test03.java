package main.Java实战.chapter05.p5_1_01;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;
import main.Java实战.chapter05.Type;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 16:29
 */
public class Test03 {
    public static void main(String[] args) {
        List<Dish> meatDishes = DataList.meau.stream()
                .filter(d->d.getType()== Type.META)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(meatDishes);
    }
}

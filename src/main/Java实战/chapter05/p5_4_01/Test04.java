package main.Java实战.chapter05.p5_4_01;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 20:19
 */
public class Test04 {
    public static void main(String[] args) {
        DataList.meau.stream()
                .filter(dish -> {
                    System.out.println(dish.getVegetarain());
                    return dish.getVegetarain();
                })
                .findAny();
    }
}

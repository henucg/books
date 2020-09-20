package main.Java实战.chapter05.p5_4_04;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 21:27
 */
public class Test01 {
    public static void main(String[] args) {
        DataList.meau.stream()
                .filter(Dish::getVegetarain)
                .findFirst()
                .ifPresent(System.out::println);
    }
}

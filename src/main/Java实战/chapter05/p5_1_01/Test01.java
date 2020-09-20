package main.Java实战.chapter05.p5_1_01;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 16:22
 */
public class Test01 {
    public static void main(String[] args) {
        List<Dish> vegetarainMenu = DataList.meau.stream()
                .filter(d->d.getVegetarain())
                .collect(Collectors.toList());

        System.out.println(vegetarainMenu);
    }
}

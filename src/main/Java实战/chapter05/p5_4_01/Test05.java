package main.Java实战.chapter05.p5_4_01;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 20:41
 */
public class Test05 {
    public static void main(String[] args) {
        DataList.meau.stream()
                .filter(Dish::getVegetarain)
                .findAny()
                .ifPresent(System.out::println);

        System.out.println(DataList.meau.stream()
                .filter(Dish::getVegetarain)
                .findAny()
                .isPresent());

        DataList.meau.stream()
                .filter(dish -> dish.getCalories()>1000)
                .findFirst()
                .ifPresentOrElse(System.out::println, new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("没有哈");
                    }
                });

        System.out.println(DataList.meau.stream()
                .filter(Dish::getVegetarain)
                .findAny()
                .get());
    }
}

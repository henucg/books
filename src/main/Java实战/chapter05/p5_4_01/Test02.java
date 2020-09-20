package main.Java实战.chapter05.p5_4_01;

import main.Java实战.chapter05.DataList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 20:10
 */
public class Test02 {
    public static void main(String[] args) {
        // 全部匹配
        DataList.meau.stream()
                .allMatch(dish -> {
                    System.out.println(dish.getVegetarain());
                    return dish.getVegetarain();
                });
    }
}

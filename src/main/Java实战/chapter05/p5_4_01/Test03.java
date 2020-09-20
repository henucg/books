package main.Java实战.chapter05.p5_4_01;

import main.Java实战.chapter05.DataList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 20:11
 */
public class Test03 {
    public static void main(String[] args) {
        // 无匹配
        DataList.meau.stream()
                .noneMatch(dish -> {
                    System.out.println(dish.getVegetarain());
                    return dish.getVegetarain();
                });
    }
}

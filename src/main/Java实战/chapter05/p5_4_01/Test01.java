package main.Java实战.chapter05.p5_4_01;

import main.Java实战.chapter05.DataList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 20:06
 */
public class Test01 {
    public static void main(String[] args) {
        // 存在匹配
        DataList.meau.stream()
                .anyMatch(dish -> {
                    System.out.println(dish.getName());
                    return dish.getVegetarain();
                });
    }
}

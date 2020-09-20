package main.Java实战.chapter05.p5_2_01;
import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 16:36
 */
public class Test01 {
    public static void main(String[] args) {
        List<Dish> lowCaloriesMeaus1 = DataList.meau.stream()
                .filter(d->{
                    System.out.println(d.getCalories());
                    return d.getCalories()<300;
                })
                .collect(toList());
        System.out.println(lowCaloriesMeaus1);


        System.out.println("-----------------------------");

        /**
         * 对于已经排序过的列表，如果取出卡路里小于300的食物
         * 会遍历整个流，但是对于海量数据构成的流
         * 某个食物不符合之后，后面的都不用再做比较了，全部遍历会消耗大量无用操作
         * takeWhile解决这种问题
         */

        List<Dish> lowCaloriesMeaus2 = DataList.meau.stream()
                .takeWhile(d->{
                    System.out.println(d.getCalories());
                    return d.getCalories()<300;
                })
                .collect(toList());

        System.out.println(lowCaloriesMeaus2);
    }
}

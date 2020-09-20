package main.Java实战.chapter06.p6_2_02;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 12:03
 */
public class Test01 {
    public static void main(String[] args) {
        // 计算菜单的总热量
        System.out.println(
                DataList.meau.stream().collect(summingInt(Dish::getCalories))
        );

        // 等价于
        System.out.println(
                DataList.meau.stream().mapToInt(Dish::getCalories).reduce(0,Integer::sum)
        );

        // 计算平均值
        System.out.println(
                DataList.meau.stream().collect(
                        averagingInt(Dish::getCalories)
                )
        );
    }
}

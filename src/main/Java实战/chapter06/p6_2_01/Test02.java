package main.Java实战.chapter06.p6_2_01;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;

import java.util.Comparator;

import static java.util.stream.Collectors.maxBy;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 11:59
 */
public class Test02 {
    public static void main(String[] args) {
        // 统计最大热量的菜单
        System.out.println(
                DataList.meau.stream().collect(maxBy(
                        Comparator.comparingInt(Dish::getCalories)
                ))
        );
    }
}

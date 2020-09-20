package main.Java实战.chapter05.p5_2_01;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 16:47
 */
public class Test02 {
    public static void main(String[] args) {
        /**
         * dropWhile 是 doWhile 的补充
         * 返回不符合条件的数据，前提也是数据已经进行过排序
         */

        List<Dish> highCalories = DataList.meau.stream()
                .dropWhile(d->{
                    System.out.println(d.getCalories());
                    return d.getCalories()<300;
                })
                .collect(Collectors.toList());

        System.out.println(highCalories);
    }
}

package main.Java实战.chapter04.p4_1_01;

import main.Java实战.chapter04.DataList;
import main.Java实战.chapter04.Dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 09:06
 */
public class Test01 {
    public static void main(String[] args) {
        // 获取低热量菜单
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for(Dish dish: DataList.meau){
            if(dish.getCalories()<400){
                lowCaloricDishes.add(dish);
            }
        }

        // 按热量排序（匿名内部类）
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(),o2.getCalories());
            }
        });

        // 获取排序之后的菜单名称
        List<String> lowCaloricDishNames = new ArrayList<>();
        for(Dish dish:lowCaloricDishes){
            lowCaloricDishNames.add(dish.getName());
        }
    }
}

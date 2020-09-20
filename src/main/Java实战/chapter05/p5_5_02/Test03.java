package main.Java实战.chapter05.p5_5_02;

import main.Java实战.chapter05.DataList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 21:45
 */
public class Test03 {
    public static void main(String[] args) {
        // 统计菜单总共有多少个菜
        System.out.println(DataList.meau.stream()
                .map(dish -> 1)
                .reduce(0,Integer::sum));

        // 统计所有菜总共多少卡路里
        System.out.println(DataList.meau.stream()
                .map(dish -> dish.getCalories())
                .reduce(0,Integer::sum));
    }
}

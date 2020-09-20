package main.Java实战.chapter04.p4_2_01;

import main.Java实战.chapter04.DataList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 10:36
 */
public class Test02 {
    public static void main(String[] args) {
        // 流只能内消耗一次
        DataList.meau.stream().forEach(System.out::println);

        DataList.meau.stream().forEach(dish -> {
            if(dish.getCalories()<400){
                System.out.println("low catoic foot:"+dish.getName());
            }
        });
    }
}

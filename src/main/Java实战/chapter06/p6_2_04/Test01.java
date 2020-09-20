package main.Java实战.chapter06.p6_2_04;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;

import static java.util.stream.Collectors.reducing;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 13:55
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(
                DataList.meau.stream()
                        .collect(reducing(0, Dish::getCalories,Integer::sum))
        );
    }
}

package main.Java实战.chapter06.p6_4_01;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import main.Java实战.chapter06.Type;

import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 12:00
 */
public class Test04 {
    public static void main(String[] args) {
        Map<Boolean,Long> map = DataList.meau.stream()
                .collect(partitioningBy(Dish::getVegetarain,counting()));

        System.out.println(map);
    }
}

package main.Java实战.chapter06.p6_4_01;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import main.Java实战.chapter06.Type;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 11:42
 */
public class Test02 {
    public static void main(String[] args) {
        Map<Boolean, Map<Type, List<Dish>>> map = DataList.meau.stream()
                .collect(partitioningBy(Dish::getVegetarain,groupingBy(Dish::getType)));

        System.out.println(map);
    }
}

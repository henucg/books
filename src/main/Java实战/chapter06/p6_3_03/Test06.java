package main.Java实战.chapter06.p6_3_03;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import main.Java实战.chapter06.Type;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 11:32
 */
public class Test06 {
    public static void main(String[] args) {
        Map<Type, Set<Integer>> map = DataList.meau.stream()
                .collect(groupingBy(Dish::getType,
                        mapping(Dish::getCalories,toCollection(HashSet::new))));

        System.out.println(map);
    }
}

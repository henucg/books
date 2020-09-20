package main.Java实战.chapter06.p6_3_01;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import main.Java实战.chapter06.Type;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 16:38
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Type, List<Dish>> dishesByType = DataList.meau.stream()
                .collect(groupingBy(Dish::getType));
        System.out.println(dishesByType);
    }
}

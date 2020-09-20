package main.Java实战.chapter06.p6_3_01;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;
import main.Java实战.chapter06.Type;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 16:46
 */
public class Test02 {
    public static void main(String[] args) {
        // 现根据条件排除，再分组，不符合条件的分组不会保留
        Map<Type,List<Dish>> dishesGroupBbyType1 = DataList.meau.stream()
                .filter(dish -> dish.getCalories()>500)
                .collect(groupingBy(Dish::getType));
        System.out.println(dishesGroupBbyType1);

        System.out.println("-------------------------");

        // 先分组然后根据条件排除，会保留分组
        Map<Type, List<Dish>> dishesGroupByType2 = DataList.meau.stream()
                .collect(
                        groupingBy(Dish::getType,
                                filtering(d->d.getCalories()>500,
                                        toList())));

        System.out.println(dishesGroupByType2);
    }
}

package main.Java实战.chapter06.p6_4_01;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 11:39
 */
public class Test01 {
    public static void main(String[] args) {
        // 分区
        Map<Boolean, List<Dish>> map = DataList.meau.stream()
                .collect(partitioningBy(Dish::getVegetarain));

        System.out.println(map);
        System.out.println(map.get(true));
    }
}

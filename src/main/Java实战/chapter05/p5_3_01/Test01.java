package main.Java实战.chapter05.p5_3_01;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 17:21
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> dishNames = DataList.meau.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(dishNames);
    }
}

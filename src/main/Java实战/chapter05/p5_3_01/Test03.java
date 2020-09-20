package main.Java实战.chapter05.p5_3_01;

import main.Java实战.chapter05.Dish;
import main.Java实战.chapter05.DataList;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 17:27
 */
public class Test03 {
    public static void main(String[] args) {
        List<Integer> dishNamesLength = DataList.meau.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList());


        System.out.println(dishNamesLength);
    }
}

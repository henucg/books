package main.Java实战.chapter04.p4_4_01;

import main.Java实战.chapter04.DataList;
import main.Java实战.chapter04.Dish;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 10:50
 */
public class Test01 {
    public static void main(String[] args) {
        DataList.meau.stream()
                .filter(d->{
                    System.out.println("filter:"+d.getName());
                    return d.getCalories()>300;
                })
                .sorted(comparing(Dish::getCalories))
                .map(d->{
                    System.out.println("map:"+d.getName());
                    return d.getName();
                })
                .limit(3)
                .collect(toList());
    }
}

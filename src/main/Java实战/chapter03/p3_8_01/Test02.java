package main.Java实战.chapter03.p3_8_01;

import main.Java实战.chapter03.Apple;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @author cg
 * @description desc
 * @date 2020-09-15 06:49
 */
public class Test02 {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                new Apple(12,13),
                new Apple(34,45),
                new Apple(5,56),
                new Apple(13,32),
                new Apple(12,12)
        );

        list.sort(comparing(Apple::getSize).thenComparing(Apple::getWeight));

        System.out.println(list);
    }
}

package main.Java实战.chapter03.p3_8_02;

import main.Java实战.chapter03.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author cg
 * @description desc
 * @date 2020-09-15 06:58
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

        Predicate<Apple> appleSizePredicate = (apple -> apple.getSize()>12);
        Predicate<Apple> appleWeightPredicate = appleSizePredicate.and(apple -> apple.getWeight()>40);

        for (Apple a:list) {
            System.out.println(appleWeightPredicate.test(a));
        }
    }
}

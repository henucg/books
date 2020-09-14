package main.Java实战.chapter02.p2_2_01;

import main.Java实战.chapter02.Apple;
import main.Java实战.chapter02.AppleColor;

/**
 * @author cg
 * @description
 * @date 2020-09-13 15:54
 */
public class Test01 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setSize(120);
        apple.setColor(AppleColor.RED.getValue());

        // 重量筛选策略
        ApplePredicate applePredicateW = new AppleHeavyWeightPredicate();
        filterApple(apple,applePredicateW);

        // 颜色筛选策略
        ApplePredicate applePredicateC = new AppleGreenColorPredicate();
        filterApple(apple,applePredicateC);
    }

    public static void filterApple(Apple apple,ApplePredicate applePredicate) {
        System.out.println(applePredicate.test(apple));
    }
}

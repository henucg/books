package main.Java实战.chapter02.p2_3_03;

import main.Java实战.chapter02.Apple;
import main.Java实战.chapter02.AppleColor;

/**
 * @author cg
 * @description desc
 * @date 2020-09-13 16:28
 */
public class Test01 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setSize(90);
        apple.setColor(AppleColor.GREEN.getValue());

        filterApple(apple,(Apple a)->a.getSize()>100);
        filterApple(apple,(Apple a)->AppleColor.GREEN.getValue().equals(a.getColor()));
    }

    public static void filterApple(Apple apple, ApplePredicate applePredicate) {
        System.out.println(applePredicate.test(apple));
    }
}

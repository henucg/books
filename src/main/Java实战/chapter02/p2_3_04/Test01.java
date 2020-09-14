package main.Java实战.chapter02.p2_3_04;

import main.Java实战.chapter02.Apple;
import main.Java实战.chapter02.AppleColor;

/**
 * @author cg
 * @description desc
 * @date 2020-09-13 16:47
 */
public class Test01 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setSize(100);
        apple.setColor(AppleColor.GREEN.getValue());

        filter(apple,(Apple a)->a.getSize()>120);
        filter(apple,(Apple a)->AppleColor.GREEN.getValue().equals(a.getColor()));
    }

    public static <T> void filter(T t, ApplePredicate<T> applePredicate) {
        System.out.println(applePredicate.test(t));
    }
}

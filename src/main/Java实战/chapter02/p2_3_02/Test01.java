package main.Java实战.chapter02.p2_3_02;

import main.Java实战.chapter02.Apple;
import main.Java实战.chapter02.AppleColor;

/**
 * @author cg
 * @description desc
 * @date 2020-09-13 16:41
 */
public class Test01 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setSize(90);
        apple.setColor(AppleColor.GREEN.getValue());

        filterApple(apple, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                if(apple!=null && apple.getSize()>100){
                    return true ;
                }
                return false ;
            }
        });
        filterApple(apple, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                if(apple!=null && AppleColor.GREEN.getValue().equals(apple.getColor())){
                    return true ;
                }
                return false ;
            }
        });
    }

    public static void filterApple(Apple apple, ApplePredicate applePredicate) {
        System.out.println(applePredicate.test(apple));
    }
}

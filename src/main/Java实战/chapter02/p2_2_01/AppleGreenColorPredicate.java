package main.Java实战.chapter02.p2_2_01;

import main.Java实战.chapter02.Apple;
import main.Java实战.chapter02.AppleColor;

/**
 * @author cg
 * @description desc
 * @date 2020-09-13 15:49
 */
public class AppleGreenColorPredicate implements ApplePredicate {
    /**
     * 根据颜色筛选策略
     * @param apple
     * @return
     */
    @Override
    public boolean test(Apple apple) {
        if(apple!=null && AppleColor.GREEN.getValue().equals(apple.getColor())){
            return true ;
        }
        return false ;
    }
}

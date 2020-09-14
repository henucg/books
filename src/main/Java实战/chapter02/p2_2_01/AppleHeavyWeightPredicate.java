package main.Java实战.chapter02.p2_2_01;

import main.Java实战.chapter02.Apple;

/**
 * @author cg
 * @description desc
 * @date 2020-09-13 15:48
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    /**
     * 根据重量筛选策略
     * @param apple
     * @return
     */
    @Override
    public boolean test(Apple apple) {
        if(apple!=null && apple.getSize()>100){
            return true ;
        }
        return false ;
    }
}

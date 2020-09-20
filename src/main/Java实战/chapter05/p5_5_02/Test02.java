package main.Java实战.chapter05.p5_5_02;

import java.util.Arrays;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 21:41
 */
public class Test02 {
    public static void main(String[] args) {
        // 求最小值
        List<Integer> nums = Arrays.asList(12,3,45,1);

        System.out.println(nums.stream().reduce(Integer.MAX_VALUE,(a,b)->a>b?b:a));

        System.out.println(nums.stream().reduce(Integer.MAX_VALUE,Integer::min));
    }
}

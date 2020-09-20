package main.Java实战.chapter05.p5_5_01;

import java.util.Arrays;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 21:34
 */
public class Test01 {
    public static void main(String[] args) {
        // 数组求和
        List<Integer> nums = Arrays.asList(12,3,45,1);

        System.out.println(nums.stream().reduce(0,(a,b)->a+b));

        System.out.println(nums.stream().reduce(0,Integer::sum));
    }
}

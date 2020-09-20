package main.Java实战.chapter05.p5_5_02;

import java.util.Arrays;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 21:39
 */
public class Test01 {
    public static void main(String[] args) {
        // 求最大值
        List<Integer> nums = Arrays.asList(12,3,45,1);

        System.out.println(nums.stream().reduce((a,b)->a>b?a:b));

        System.out.println(nums.stream().reduce(Integer::max));
    }
}

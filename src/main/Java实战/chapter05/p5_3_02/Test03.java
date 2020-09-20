package main.Java实战.chapter05.p5_3_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 17:55
 */
public class Test03 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        List<Integer> numsResult = nums.stream()
                .map(i->i*i)
                .collect(Collectors.toList());

        System.out.println(numsResult);
    }
}

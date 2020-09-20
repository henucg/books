package main.Java实战.chapter05.p5_3_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-19 19:52
 */
public class Test05 {
    public static void main(String[] args) {
        // 尝试返回笛卡尔集合中和能被3整除的集合

        List<Integer> nums1 = Arrays.asList(1,2,3);
        List<Integer> nums2 = Arrays.asList(4,5);

        nums1.stream()
                .flatMap(i -> {
                    System.out.println("nums1:"+i);
                    return nums2.stream()
                            .filter(j->(i+j)%3==0)
                            .map(j->{
                                System.out.println("nums2:"+j);
                                return new Integer[]{i,j};
                            });
                })
                .collect(Collectors.toList());
    }
}

package main.Java实战.chapter06.p6_2_03;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;

import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 12:21
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * 拼接字符串
         * 如果Dish内部有一个返回Name方法，那么不需要map步骤
         * joining内部采用的是StringBuilder拼接字符串
         */
        System.out.println(
                DataList.meau.stream()
                        .map(Dish::getName)
                        .collect(Collectors.joining())
        );

        // 拼接之后用逗号分隔
        System.out.println(
                DataList.meau.stream()
                        .map(Dish::getName)
                        .collect(Collectors.joining(","))
        );
    }
}

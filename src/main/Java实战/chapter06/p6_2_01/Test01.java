package main.Java实战.chapter06.p6_2_01;

import main.Java实战.chapter06.DataList;

import static java.util.stream.Collectors.counting;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 11:57
 */
public class Test01 {
    public static void main(String[] args) {
        // collect 统计数量
        System.out.println(
                DataList.meau.stream().count()
        );

        System.out.println(
                DataList.meau.stream().collect(counting())
        );
    }
}

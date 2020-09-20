package main.Java实战.chapter06.p6_2_02;

import main.Java实战.chapter06.DataList;
import main.Java实战.chapter06.Dish;

import java.util.IntSummaryStatistics;

import static java.util.stream.Collectors.summarizingInt;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 12:11
 */
public class Test02 {
    public static void main(String[] args) {
        // 一次性求出总和、最大值、最小值、平均值
        IntSummaryStatistics summaryStatistics =
                DataList.meau.stream()
                        .collect(summarizingInt(Dish::getCalories));
        System.out.println(summaryStatistics.toString());
    }
}

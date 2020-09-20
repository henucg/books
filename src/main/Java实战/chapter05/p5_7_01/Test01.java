package main.Java实战.chapter05.p5_7_01;

import main.Java实战.chapter05.DataList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 09:01
 */
public class Test01 {
    public static void main(String[] args) {
        // 使用原始流 计算交易总额
        System.out.println(
                DataList.transactions.stream()
                        .mapToInt(t->t.getValue())
                        .sum()
        );

        // 使用原始流 计算最大交易额
        System.out.println(
                DataList.transactions.stream()
                        .mapToInt(t->t.getValue())
                        .max()
                        .getAsInt()
        );
    }
}

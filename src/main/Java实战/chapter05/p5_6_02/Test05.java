package main.Java实战.chapter05.p5_6_02;

import main.Java实战.chapter05.DataList;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 08:44
 */
public class Test05 {
    public static void main(String[] args) {
        // 有没有交易员是在米兰工作的
        System.out.println(
                DataList.transactions.stream()
                    .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()))
        );
    }
}

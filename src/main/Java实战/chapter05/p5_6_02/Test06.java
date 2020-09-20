package main.Java实战.chapter05.p5_6_02;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Transaction;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 08:47
 */
public class Test06 {
    public static void main(String[] args) {
        // 打印生活在剑桥的交易员的所有交易额
        System.out.println(
                DataList.transactions.stream()
                        .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                        .map(Transaction::getValue)
                        .reduce(0,Integer::sum)
        );

        // 最高交易额
        System.out.println(
                DataList.transactions.stream()
                        .map(transaction -> transaction.getValue())
                        .reduce(Integer.MIN_VALUE,Integer::max)
        );

        System.out.println(
                DataList.transactions.stream()
                        .map(transaction -> transaction.getValue())
                        .reduce(Integer.MIN_VALUE,(v1,v2)->v1>v2?v1:v2)
        );
    }
}

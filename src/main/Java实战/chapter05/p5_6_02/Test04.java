package main.Java实战.chapter05.p5_6_02;

import main.Java实战.chapter05.DataList;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 08:09
 */
public class Test04 {
    public static void main(String[] args) {
        // 返回所有剑桥的交易员的名称
        Set<String> names = DataList.transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(transaction -> transaction.getTrader().getName())
                .collect(toSet());
        System.out.println(names);

        // 返回所有剑桥的交易员的名称字符串（效率低）
        String nameStr = DataList.transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(s1,s2)->s1+s2);
        System.out.println(nameStr);

        // 返回所有剑桥的交易员的名称字符串（效率高）
        String nameStr2 = DataList.transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println(nameStr2);
    }
}

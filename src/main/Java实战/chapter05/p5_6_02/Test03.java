package main.Java实战.chapter05.p5_6_02;

import main.Java实战.chapter05.DataList;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 08:07
 */
public class Test03 {
    public static void main(String[] args) {
        Set<String> cities = DataList.transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());

        System.out.println(cities);
    }
}

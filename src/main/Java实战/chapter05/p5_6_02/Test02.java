package main.Java实战.chapter05.p5_6_02;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Transaction;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 08:04
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> cities = DataList.transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(cities);
    }
}

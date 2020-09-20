package main.Java实战.chapter05.p5_6_02;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 07:59
 */
public class Test01 {
    public static void main(String[] args) {
        List<Transaction> transactions = DataList.transactions.stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(transactions);
    }
}

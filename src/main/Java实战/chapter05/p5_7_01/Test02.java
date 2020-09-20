package main.Java实战.chapter05.p5_7_01;

import main.Java实战.chapter05.DataList;
import main.Java实战.chapter05.Transaction;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 09:10
 */
public class Test02 {
    public static void main(String[] args) {
        IntStream intStream = DataList.transactions.stream()
                .mapToInt(Transaction::getValue);

        // 原始流转化为对象流
        Stream<Integer> streamInteger = intStream.boxed();
    }
}

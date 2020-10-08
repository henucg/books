package main.Java实战.chapter08.p8_3_02;

import java.util.Map;

/**
 * @author cg
 * @description desc
 * @date 2020-10-04 13:49
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("tom",12,"jack",6,"jane",8);

        // 根据key排序
        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByKey())
           .forEach(System.out::println);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(System.out::println);

        // 根据Value排序
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByValue())
           .forEachOrdered(System.out::println);
    }
}

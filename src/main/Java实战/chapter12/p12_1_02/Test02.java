package main.Java实战.chapter12.p12_1_02;

import java.time.LocalDateTime;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 08:53
 */
public class Test02 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.toLocalDate());

        System.out.println(localDateTime.toLocalTime());
    }
}

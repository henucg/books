package main.Java实战.chapter12.p12_1_01;

import java.time.LocalTime;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 08:42
 */
public class Test04 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12,13,45);

        System.out.println(time.getHour());

        System.out.println(time.getMinute());

        System.out.println(time.getSecond());
    }
}

package main.Java实战.chapter12.p12_1_01;

import java.time.LocalTime;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 08:40
 */
public class Test03 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        System.out.println(time.getHour());

        System.out.println(time.getMinute());

        System.out.println(time.getSecond());

        System.out.println(time.getNano());
    }
}

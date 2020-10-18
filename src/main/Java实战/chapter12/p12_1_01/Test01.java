package main.Java实战.chapter12.p12_1_01;

import java.time.LocalDate;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 08:22
 */
public class Test01 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,10,15);

        System.out.println(date.getYear());

        System.out.println(date.getMonthValue());

        System.out.println(date.getDayOfMonth());

        LocalDate now = LocalDate.now();

        System.out.println(now.getYear());

        System.out.println(now.getMonthValue());

        System.out.println(now.getDayOfMonth());
    }
}

package main.Java实战.chapter12.p12_1_01;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 08:26
 */
public class Test02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println(now.get(ChronoField.YEAR));

        System.out.println(now.get(ChronoField.MONTH_OF_YEAR));

        System.out.println(now.get(ChronoField.DAY_OF_MONTH));
    }
}

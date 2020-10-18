package main.Java实战.chapter12.p12_2_01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 10:06
 */
public class Test01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017,9,21);

        LocalDate date1 = localDate.plusDays(11);

        LocalDate date2 = localDate.minusYears(6);

        LocalDate date3 = localDate.plus(6, ChronoUnit.YEARS);
    }
}

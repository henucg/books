package main.Java实战.chapter12.p12_2_01;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 10:26
 */
public class Test02 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018,12,11);

        LocalDate localDate1 = localDate.with(nextOrSame(DayOfWeek.SUNDAY));

        LocalDate localDate2 = localDate.with(lastDayOfMonth());
    }
}

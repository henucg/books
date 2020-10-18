package main.Java实战.chapter12.p12_1_02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 08:46
 */
public class Test01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2018,12,25,1,56,35);

        LocalDate date = LocalDate.now();

        LocalTime time = LocalTime.now();

        LocalDateTime dateTimeNow = LocalDateTime.of(date,time);

        LocalDateTime dateTimeNow2 = date.atTime(time);

        LocalDateTime dateTimeNow3 = time.atDate(date);
    }
}

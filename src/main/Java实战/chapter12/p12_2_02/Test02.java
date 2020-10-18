package main.Java实战.chapter12.p12_2_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 10:39
 */
public class Test02 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("20190912", DateTimeFormatter.BASIC_ISO_DATE);

        LocalDate localDate1 = LocalDate.parse("2019-09-12",DateTimeFormatter.ISO_LOCAL_DATE);
    }
}

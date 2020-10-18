package main.Java实战.chapter12.p12_2_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 10:34
 */
public class Test01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017,12,23);

        System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));

        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));

        //System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}

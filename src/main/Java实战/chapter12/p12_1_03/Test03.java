package main.Java实战.chapter12.p12_1_03;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 09:09
 */
public class Test03 {
    public static void main(String[] args) {
        Period period = Period.between(LocalDate.of(2020,10,16),
                LocalDate.of(2020,10,12));

        System.out.println(period.getDays());
    }
}

package main.Java实战.chapter12.p12_1_03;

import java.time.Instant;
import java.time.temporal.ChronoField;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 09:00
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * Instant 只要衡量 秒，纳秒级别的数据
         */

        Instant instant = Instant.now();

        System.out.println(instant.getNano());
    }
}

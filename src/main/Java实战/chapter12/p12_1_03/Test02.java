package main.Java实战.chapter12.p12_1_03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

/**
 * @author cg
 * @description desc
 * @date 2020-10-18 09:04
 */
public class Test02 {
    public static void main(String[] args) {
        /**
         * Duration是用来统计秒级一下的时间差异
         */

        LocalTime time1 = LocalTime.now();
        Instant instant1 = Instant.now();

        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }

        LocalTime time2 = LocalTime.now();
        Instant instant2 = Instant.now();

        Duration duration1 = Duration.between(time1,time2);
        Duration duration2 = Duration.between(instant1,instant2);

        System.out.println(duration1.getNano());
        System.out.println(duration2.getNano());
    }
}

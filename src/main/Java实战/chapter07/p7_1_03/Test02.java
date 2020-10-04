package main.Java实战.chapter07.p7_1_03;

import java.util.stream.LongStream;

/**
 * @author cg
 * @description desc
 * @date 2020-10-03 19:27
 */
public class Test02 {
    public static void main(String[] args) {
        Accumutor accumutor = new Accumutor();

        long startTime = System.currentTimeMillis();

        LongStream.rangeClosed(1,10000000).parallel().forEach(accumutor::add);

        long endTime = System.currentTimeMillis();

        System.out.println("total="+accumutor.total+",time="+(endTime-startTime));
    }
}

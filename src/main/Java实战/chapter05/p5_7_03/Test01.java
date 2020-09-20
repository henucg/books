package main.Java实战.chapter05.p5_7_03;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 10:12
 */
public class Test01 {
    public static void main(String[] args) {

        // 1—100以内的勾股数

        Stream<int[]> arrs =
                IntStream.rangeClosed(1,100)
                        .boxed()
                        .flatMap(a->IntStream.rangeClosed(a,100)
                                .filter(b->Math.sqrt(a*a + b*b)%1==0)
                                .mapToObj(b->new int[]{a,b,(int)Math.sqrt(a*a+b*b)}));

        arrs.forEach(t-> System.out.println("["+t[0]+","+t[1]+","+t[2]+"]"));
    }
}

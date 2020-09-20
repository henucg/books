package main.Java实战.chapter05.p5_7_03;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 10:30
 */
public class Test02 {
    public static void main(String[] args) {

        // 1—100以内的勾股数（优化）

        Stream<double[]> arr = IntStream.rangeClosed(1,100)
                .boxed()
                .flatMap(a->IntStream.rangeClosed(a,100)
                        .mapToObj(b->new double[]{a,b,Math.sqrt(a*a+b*b)})
                        .filter(t->t[2]%1==0));

        arr.forEach(t-> System.out.println("["+t[0]+","+t[1]+","+t[2]+"]"));
    }
}

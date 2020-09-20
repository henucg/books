package main.Java实战.chapter05.p5_8_05;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-09-20 11:07
 */
public class Test02 {
    public static void main(String[] args) {
        // 无限流创建菲波那切数列
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(10)
                .forEach(t-> System.out.println("["+t[0]+","+t[1]+"]"));

        System.out.println("------------------");

        // 打印菲波那切数列
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(10)
                .map(t->t[0])
                .forEach(System.out::println);
    }
}

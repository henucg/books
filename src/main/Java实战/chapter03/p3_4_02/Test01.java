package main.Java实战.chapter03.p3_4_02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author cg
 * @description desc
 * @date 2020-09-13 20:11
 */
public class Test01 {
    public static void main(String[] args) {
        foreach (Arrays.asList(1,2,4,5,3,6),(Integer i)-> System.out.println(i));
    }

    public static <T> void foreach(List<T> list, Consumer<T> c){
        for (T t:list){
            c.accept(t);
        }
    }
}

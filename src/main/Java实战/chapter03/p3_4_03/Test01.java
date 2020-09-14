package main.Java实战.chapter03.p3_4_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author cg
 * @description desc
 * @date 2020-09-13 20:21
 */
public class Test01 {
    public static void main(String[] args) {
        map(Arrays.asList("asfa","SF","a"),(String s)->s.length());
    }

    public static <T,R> void map(List<T> list, Function<T,R> f){
        List<R> l = new ArrayList<>();
        for(T t:list){
            l.add(f.apply(t));
        }
        System.out.println(l);
    }
}

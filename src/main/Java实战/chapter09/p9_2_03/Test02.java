package main.Java实战.chapter09.p9_2_03;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 21:08
 */
public class Test02 {
    public static void main(String[] args) {
        // Lambda 实现责任链模式

        UnaryOperator<String> handleProcessing = (String txt)->"From Tom:"+txt;
        UnaryOperator<String> spellCheckProcessing = (String txt)->txt.replace("labda","lambda");

        Function<String,String> function = handleProcessing.andThen(spellCheckProcessing);
        System.out.println(function.apply("Aren't labda really sexy???"));
    }
}

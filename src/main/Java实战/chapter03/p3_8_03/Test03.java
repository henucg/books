package main.Java实战.chapter03.p3_8_03;

import java.util.function.Function;

/**
 * @author cg
 * @description desc
 * @date 2020-09-15 07:34
 */
public class Test03 {
    public static void main(String[] args) {
        Function<String,String> addHeaderFunction = Letter::addHeader;
        Function<String,String> addFooterFunction = Letter::addFooter;
        Function<String,String> checkSpellingFunction = Letter::checkSpelling;

        String content = "Helo,I miss you!" ;

        Function<String,String> function = addHeaderFunction
                .andThen(addFooterFunction)
                .andThen(checkSpellingFunction);

        System.out.println(function.apply(content));
    }
}

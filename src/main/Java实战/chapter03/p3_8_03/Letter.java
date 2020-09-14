package main.Java实战.chapter03.p3_8_03;

/**
 * @author cg
 * @description desc
 * @date 2020-09-15 07:30
 */
public class Letter {

    public static String addHeader(String txt) {
        return "From Tom,Jack " + txt;
    }

    public static String addFooter(String txt){
        return txt + "Kind regards";
    }

    public static String checkSpelling(String txt){
        return txt.replace("Helo","hello");
    }
}

package main.Java实战.chapter09.p9_2_01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:12
 */
public class Test02 {

    public static void main(String[] args) {
        // Lambda表达式实现策略模式

        // 策略1
        Validator validator = new Validator((String s)->s.matches("[a-z]+"));
        System.out.println(validator.validate("aaaa"));
        System.out.println(validator.validate("Aaaa"));

        // 策略2
        Validator validator2 = new Validator((String s)->s.matches("\\d+"));
        System.out.println(validator2.validate("1111"));
        System.out.println(validator2.validate("a111"));
    }
}

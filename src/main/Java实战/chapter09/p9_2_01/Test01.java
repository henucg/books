package main.Java实战.chapter09.p9_2_01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:08
 */
public class Test01 {

    public static void main(String[] args) {
        // 实现策略模式

        // 策略1
        Validator validator = new Validator(new IsAllLowerCaseStrategy());
        System.out.println(validator.validate("ssss"));
        System.out.println(validator.validate("Ssss"));

        // 策略2
        Validator validator2 = new Validator(new IsNumbericStrategy());
        System.out.println(validator2.validate("1111"));
        System.out.println(validator2.validate("a111"));
    }
}

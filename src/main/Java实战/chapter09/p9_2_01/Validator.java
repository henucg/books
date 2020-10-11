package main.Java实战.chapter09.p9_2_01;

/**
 * @author cg
 * @description 校验字符串的策略模式
 * @date 2020-10-11 20:06
 */
public class Validator {

    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy){
        this.strategy = strategy;
    }

    public boolean validate(String s){
        return strategy.execute(s);
    }
}

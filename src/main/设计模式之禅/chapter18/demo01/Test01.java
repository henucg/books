package main.设计模式之禅.chapter18.demo01;

/**
 * @author cg
 * @description 实现
 * @date 2020-10-18 15:04
 */
public class Test01 {

    public static void main(String[] args) {
        PayContext payContext = new PayContext(new ZhifubaoPay());

        payContext.executePay(12);
    }
}

package main.设计模式之禅.chapter18.demo03;

/**
 * @author cg
 * @description 枚举实现策略模式
 * @date 2020-10-18 15:35
 */
public class Test01 {
    public static void main(String[] args) {
        PayEnum.UNION_PAY.pay(12);

        PayEnum.WECHAT_PAY.pay(23);

        PayEnum.ZHIFUBAO_PAY.pay(2);
    }
}

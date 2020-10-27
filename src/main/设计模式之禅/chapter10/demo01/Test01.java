package main.设计模式之禅.chapter10.demo01;

/**
 * @author cg
 * @description 模板方法模式
 * @date 2020-10-26 22:16
 */
public class Test01 {

    public static void main(String[] args) {
        AbstractCar bmwCar = new BmwCar(true);
        bmwCar.run();

        System.out.println("==============");

        AbstractCar benzCar = new BenzCar(false);
        benzCar.run();
    }
}

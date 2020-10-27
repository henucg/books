package main.设计模式之禅.chapter10.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-26 22:14
 */
public class BenzCar extends AbstractCar {

    private boolean alerm;

    public BenzCar(boolean alarm){
        this.alerm = alarm;
    }

    @Override
    protected void buildTyre() {
        System.out.println("创建奔驰轮胎");
    }

    @Override
    protected void buildGlass() {
        System.out.println("创建奔驰玻璃");
    }

    @Override
    protected void buildEngine() {
        System.out.println("创建奔驰引擎");
    }

    @Override
    protected void assembly() {
        System.out.println("组装奔驰汽车");
    }

    @Override
    protected void start() {
        System.out.println("发送奔驰车");
    }

    @Override
    protected boolean isAlarm() {
        return this.alerm;
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰鸣笛");
    }
}

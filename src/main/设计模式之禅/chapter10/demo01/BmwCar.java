package main.设计模式之禅.chapter10.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-26 22:12
 */
public class BmwCar extends AbstractCar {

    private boolean alerm;

    public BmwCar(boolean alarm){
        this.alerm = alarm;
    }

    @Override
    protected void buildTyre() {
        System.out.println("创建宝马轮胎");
    }

    @Override
    protected void buildGlass() {
        System.out.println("创建宝马玻璃");
    }

    @Override
    protected void buildEngine() {
        System.out.println("创建宝马引擎");
    }

    @Override
    protected void assembly() {
        System.out.println("组装宝马汽车");
    }

    @Override
    protected void start() {
        System.out.println("发动宝马车");
    }

    @Override
    protected boolean isAlarm() {
        return this.alerm;
    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣笛");
    }
}

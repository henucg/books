package main.设计模式之禅.chapter10.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-26 22:06
 */
public abstract class AbstractCar {

    // 创建轮胎
    protected abstract void buildTyre();

    // 创建玻璃
    protected abstract void buildGlass();

    // 创建引擎
    protected abstract void buildEngine();

    // 组装
    protected abstract void assembly();

    // 启动
    protected abstract void start();

    // 是否鸣笛
    /**
     * 抽象类中isAlarm的返回值就是影响了模板方法的执行结果，该方法就叫做钩子方法（Hook Method）
     * 子类通过这个方法，控制父类中 alarm() 是否执行，相当于一个是子类挂在父类中的一个钩子
     * 来决定父类是否挂某个东西（是否执行某一行为）
     * @return
     */
    protected abstract boolean isAlarm();

    // 鸣笛
    protected abstract void alarm();

    public void run(){
        this.buildEngine();
        this.buildGlass();
        this.buildEngine();
        this.assembly();
        this.start();
        if(this.isAlarm()){
            this.alarm();
        }
    }
}

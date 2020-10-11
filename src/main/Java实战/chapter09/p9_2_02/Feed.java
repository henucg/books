package main.Java实战.chapter09.p9_2_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:37
 */
public class Feed implements Subject {
    // 观察者列表
    List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers(String news) {
        observers.forEach(o->o.notify(news));
    }
}

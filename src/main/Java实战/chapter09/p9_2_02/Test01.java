package main.Java实战.chapter09.p9_2_02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:40
 */
public class Test01 {
    public static void main(String[] args) {
        // 实现观察者模式
        Feed feed = new Feed();
        feed.registerObserver(new ObserverA());
        feed.registerObserver(new ObserverB());
        feed.registerObserver(new ObserverC());

        feed.notifyObservers("The queen said her favourite book is Modern Java In Action");
    }
}

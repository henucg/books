package main.设计模式之禅.chapter07.demo04;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 09:08
 */
public class Test01 {
    public static void main(String[] args) {
        Set<SingleTon> set = new CopyOnWriteArraySet<>();

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    set.add(SingleTon.getSingleTon());
                }
            }).start();
        }

        System.out.println(set.size());
    }
}

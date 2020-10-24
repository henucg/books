package main.设计模式之禅.chapter07.demo02;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 08:43
 */
public class Test02 {

    public static void main(String[] args) throws Exception {
        Set<SingleTon> set = new CopyOnWriteArraySet<>();
        for(int i=0;i<100;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    set.add(SingleTon.getSingleTon());
                }
            });

            thread.start();
        }

        // 如果Set值大于1，表名明创建了多个对象，线程不安全
        System.out.println(set.size());
    }
}

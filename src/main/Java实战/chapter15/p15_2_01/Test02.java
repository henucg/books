package main.Java实战.chapter15.p15_2_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author cg
 * @description desc
 * @date 2020-10-19 08:11
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        int x = 1337;

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> y = executorService.submit(()->f(x));
        Future<Integer> z = executorService.submit(()->g(x));

        System.out.println(y.get()+z.get());

        executorService.shutdown();
    }

    public static int f(int x) {
        return x+1;
    }

    public static int g(int x) {
        return x+1;
    }
}

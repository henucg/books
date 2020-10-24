package main.Java实战.chapter16.p16_1_01;

import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 21:28
 */
public class Test01 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Long> future = executorService.submit(new Callable<Long>() {
            @Override
            public Long call() {
                // 计算1-10000的和
                int sum = Stream.iterate(1,i->i+1)
                        .limit(10000)
                        .reduce(0,Integer::sum);

                return Long.valueOf(sum);
            }
        });

        try {
            System.out.println(future.get(1L,TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}

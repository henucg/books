package main.Java实战.chapter15.p15_2_01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-19 08:04
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        int x = 1337;

        Result result = new Result();

        Thread t1 = new Thread(()->{
            result.left = f(x);
        });

        Thread t2 = new Thread(()->{
            result.right = g(x);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(result.left+result.right);
    }

    public static int f(int x){
        return x+1;
    }

    public static int g(int x){
        return x+2;
    }

    private static class Result{
        private int left;
        private int right;
    }
}

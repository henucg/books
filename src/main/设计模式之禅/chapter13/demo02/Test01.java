package main.设计模式之禅.chapter13.demo02;

/**
 * @author cg
 * @description desc
 * @date 2020-11-05 07:51
 */
public class Test01 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setI(0);
        demo.setJ("a");
        demo.addList("A");

        Demo demoClone = demo.clone();
        demoClone.setI(1);
        demoClone.setJ("b");
        demoClone.addList("B");

        System.out.println(demo.toString());
        System.out.println(demoClone.toString());
    }
}

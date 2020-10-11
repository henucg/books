package main.Java实战.chapter09.p9_2_03;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 21:04
 */
public class Test01 {
    public static void main(String[] args) {
        // 实现责任链模式
        ProcessingObject<String> p1 = new HandleTxtProcessing();
        ProcessingObject<String> p2 = new SpellCheckProcessing();

        p1.setSuccessor(p2);

        System.out.println(p1.handle("Aren't labda really sexy???"));
    }
}

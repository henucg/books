package main.Java实战.chapter09.p9_2_03;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 21:02
 */
public class SpellCheckProcessing extends ProcessingObject<String> {
    @Override
    protected String handleWork(String txt) {
        return txt.replace("labda","lambda");
    }
}

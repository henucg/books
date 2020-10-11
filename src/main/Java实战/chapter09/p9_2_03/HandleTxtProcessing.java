package main.Java实战.chapter09.p9_2_03;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 21:01
 */
public class HandleTxtProcessing extends ProcessingObject<String> {
    @Override
    protected String handleWork(String txt) {
        return "From Tom:"+txt;
    }
}

package main.Java实战.chapter09.p9_2_01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:05
 */
public class IsNumbericStrategy implements ValidationStrategy {

    /**
     * 校验字符串是否都是数字
     * @param s
     * @return
     */
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}

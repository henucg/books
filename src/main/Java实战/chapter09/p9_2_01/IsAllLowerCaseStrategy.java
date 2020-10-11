package main.Java实战.chapter09.p9_2_01;

/**
 * @author cg
 * @description desc
 * @date 2020-10-11 20:03
 */
public class IsAllLowerCaseStrategy implements ValidationStrategy {

    /**
     * 校验字符串是否都是小写字母
     * @param s
     * @return
     */
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}

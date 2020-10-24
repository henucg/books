package main.设计模式之禅.chapter08.demo03;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 21:04
 */
public class HumanFactory {

    /**
     * 创建 Human 对象
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T extends Human> T buildHuman(Class<T> clazz){
        Human human = null ;

        try{
            human = (T)clazz.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        return (T)human;
    }

    public static <T extends Sex> T buildSex(Class<T> clazz){
        Sex sex = null ;

        try{
            sex = (T)clazz.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        return (T)sex;
    }
}

package main.设计模式之禅.chapter08.demo01;

/**
 * @author cg
 * @description 简单工厂模式
 * @date 2020-10-24 10:07
 */
public class HumanFactory {

    public static <T extends Human> T createHuman(Class<T> clazz){
        Human human = null;
        try{
            human = (T)clazz.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)human;
    }
}

package main.设计模式之禅.chapter08.demo02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 10:19
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null ;

        try{
            human = (T)clazz.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        return (T)human;
    }
}

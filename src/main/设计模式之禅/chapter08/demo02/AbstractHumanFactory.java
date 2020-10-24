package main.设计模式之禅.chapter08.demo02;

/**
 * @author cg
 * @description desc
 * @date 2020-10-24 10:18
 */
public abstract class AbstractHumanFactory {

    abstract <T extends Human> T createHuman(Class<T> t);
}

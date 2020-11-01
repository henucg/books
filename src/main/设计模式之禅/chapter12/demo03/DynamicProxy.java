package main.设计模式之禅.chapter12.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author cg
 * @description desc
 * @date 2020-10-31 23:07
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader classLoader,
                                         Class<?>[] interfaces,
                                         InvocationHandler invocationHandler){


        return (T) Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}

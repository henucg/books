package main.设计模式之禅.chapter12.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author cg
 * @description desc
 * @date 2020-10-31 23:04
 */
public class UserInvocationHandler implements InvocationHandler {

    private Object object;

    public UserInvocationHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }
}

package com.tuling.jdkProxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class DaoJdkProxy implements InvocationHandler {


    private  Object targetObject;
    public DaoJdkProxy(Object target) {
         this.targetObject=target;
    }

    public DaoJdkProxy() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //System.out.println("proxy.....");
       return method.invoke(targetObject, args);
    }
}

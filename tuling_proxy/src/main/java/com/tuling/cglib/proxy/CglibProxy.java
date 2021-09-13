package com.tuling.cglib.proxy;

import com.tuling.cglib.mapper.Dao;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 创建一个Dao代理
 */
public class CglibProxy implements MethodInterceptor {

    // 传入被代理目标类Class
    public CglibProxy(Class<?> target) {
        this.target = target;
    }

    public CglibProxy() {
    }

    Class<?> target;

    // obj是生成的代理后的子类  ，
    // method是调用的方法 ，args是方法入参 ，
    // proxy是MethodProxy代理对象   要理解cglib ， 重点了解MethodProxy
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        //  这样就直接调用具体方法
        //  proxy.invoke(传进来个target,args)

        //invokeSuper 会通过FastClass, 也就是调用本类方法会再次代理
        proxy.invokeSuper(obj, args);
        System.out.println(obj.getClass());
        //Spring直接执行的责任链调用，  相当于
        System.out.println("end intercept");
        return obj;
    }
}

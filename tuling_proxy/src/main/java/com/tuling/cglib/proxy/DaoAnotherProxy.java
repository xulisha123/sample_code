package com.tuling.cglib.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DaoAnotherProxy {

    public static void before(){
        System.out.println("前置通知!");
    }


}

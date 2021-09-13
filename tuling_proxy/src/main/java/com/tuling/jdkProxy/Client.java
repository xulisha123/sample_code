package com.tuling.jdkProxy;

import com.tuling.cglib.mapper.Dao;
import com.tuling.cglib.mapper.IDao;
import com.tuling.jdkProxy.proxy.DaoJdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class Client {


    public static void main(String[] args) {
        //将生成的代理类文件存到项目根目录
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        IDao dao =(IDao) Proxy.newProxyInstance(
                    Dao.class.getClassLoader(),        // 代理类加载器
                    Dao.class.getInterfaces(),         // 代理的接口
                    new DaoJdkProxy(new Dao()));


        long l = System.currentTimeMillis();
        for (int i=0;i<999999999;i++){
            dao.select();
        }
        long e = System.currentTimeMillis();

        // 3696
        System.out.println(e-l);
    }
}

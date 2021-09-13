package com.tuling.cglib;

import com.tuling.cglib.filter.DaoFilter;
import com.tuling.cglib.mapper.Dao;
import com.tuling.cglib.mapper.DaoNoInterface;
import com.tuling.cglib.mapper.IDao;
import com.tuling.cglib.proxy.CglibProxy;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class Client {
    public static void main(String[] args) {


        //将生成的代理类文件存到项目根目录
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./");
        //实例化增强器
        Enhancer enhancer = new Enhancer();
        //设置需要代理的目标类
        enhancer.setSuperclass(Dao.class);
        //enhancer.setInterfaces(new Class[]{IDao.class});
        //设置拦截对象 回调的实现类
        enhancer.setCallback(new CglibProxy());
        //使用create 返回Object 生成代理类并返回实例
        Dao dao = (Dao) enhancer.create();
        //select优先级高 使用DaoProxy

       /*
        测试耗时
        long l = System.currentTimeMillis();
        for (int i=0;i<999999999;i++){
            dao.select();
        }
        long e = System.currentTimeMillis();
        // 4777 3696
        System.out.println(e-l);*/

        //无法代理被final修饰的方法
        //dao.delete();
        dao.select();

    }
}

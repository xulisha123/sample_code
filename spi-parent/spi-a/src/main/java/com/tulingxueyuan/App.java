package com.tulingxueyuan;

import com.tulingxueyuan.dao.IUserDao;

import java.util.ServiceLoader;

/**
 * @author xushu
 * @time 2020/12/22 22:41:41
 */
public class App {
    public static void main(String[] args) {
        ServiceLoader<IUserDao> daos = ServiceLoader.load(IUserDao.class);
        for (IUserDao dao : daos) {
            dao.save();
        }
    }
}

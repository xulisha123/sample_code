package com.tulingxueyuan.dao.impl;

import com.tulingxueyuan.dao.IUserDao;

/**
 * @author xushu
 * @time 2020/12/22 22:55:36
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("spi-c save...");
    }
}

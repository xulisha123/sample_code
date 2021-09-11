package com.tulingxueyuan.dao.impl;

import com.tulingxueyuan.dao.IUserDao;

/**
 * @author xushu
 * @time 2020/12/22 22:40:31
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("spi-b save...");
    }
}

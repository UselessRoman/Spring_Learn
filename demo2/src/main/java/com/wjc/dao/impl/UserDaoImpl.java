package com.wjc.dao.impl;

import com.wjc.dao.UserDao;

public class UserDaoImpl implements UserDao {


    @Override
    public void save() {
        System.out.println("user dao saving");
    }
}

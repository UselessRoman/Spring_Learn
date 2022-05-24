package com.wjc.dao.impl;

import com.wjc.dao.BookDao;

public class BookDaoImpl implements BookDao
{
    @Override
    public void save()
    {
        System.out.println("Book Dao saving");
    }


    //Bean初始化操作
    public void init()
    {
        System.out.println("init..");
    }

    //Bean销毁前操作
    public void destory()
    {
        System.out.println("destorying..");
    }
}

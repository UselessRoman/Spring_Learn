package com.wjc.dao.impl;

import com.wjc.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao
{
    @Value("${name}")
    private String name;

    private int num;


    @Override
    public void save() {
        System.out.println("Book Dao "+name+" saving ");
    }


    @PostConstruct
    public void init()
    {
        System.out.println("Init..");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("destroying..");
    }
}

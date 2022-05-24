package com.wjc.dao.impl;

import com.wjc.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private BookDaoImpl() {
        System.out.println("book dao constructor running");
    }

    @Override
    public void save() {
        System.out.println("book dao saving");

    }
}

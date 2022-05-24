package com.wjc.dao.impl;

import com.wjc.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int databaseNum;

    public BookDaoImpl(String databaseName, int databaseNum) {
        this.databaseName = databaseName;
        this.databaseNum = databaseNum;
    }

    @Override
    public void save() {
        System.out.println("Book Dao saving +"+databaseName+databaseNum);
    }
}

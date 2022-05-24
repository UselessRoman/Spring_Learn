package com.wjc.service.impl;

import com.wjc.dao.BookDao;
import com.wjc.service.BookService;

public class BookServiceImpl implements BookService {

    //不需要使用new方式
    private BookDao bookDao;

    //set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service saving");
        bookDao.save();
    }
}

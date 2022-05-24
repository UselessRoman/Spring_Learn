package com.wjc.service.impl;

import com.wjc.dao.BookDao;
import com.wjc.service.BookService;

public class BookServiceImpl implements BookService
{
    private BookDao bookDao;

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    //构造器注入
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save()
    {
        bookDao.save();
        System.out.println("Book Service saving");

    }
}

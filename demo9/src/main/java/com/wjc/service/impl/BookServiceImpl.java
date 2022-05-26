package com.wjc.service.impl;

import com.wjc.dao.BookDao;
import com.wjc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService
{

    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save()
    {

        bookDao.save();
        System.out.println("Book Service saving");

    }
}

package com.wjc.service.impl;

import com.wjc.dao.BookDao;
import com.wjc.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    
    private BookDao bookDao;
    
    @Override
    public void save() {
        bookDao.save();
        System.out.println("Book Service Saving");
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" service destorying");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("service init");

    }
}

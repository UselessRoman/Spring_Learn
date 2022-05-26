package com.wjc.dao.impl;

import com.wjc.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao
{
    @Override
    public void save() {
        System.out.println("Book Dao saving ");
    }
}

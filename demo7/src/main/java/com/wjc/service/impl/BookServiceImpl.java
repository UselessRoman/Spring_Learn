package com.wjc.service.impl;

import com.wjc.dao.BookDao;
import com.wjc.service.BookService;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService
{

    @Override
    public void save()
    {
        System.out.println("Book Service saving");

    }
}

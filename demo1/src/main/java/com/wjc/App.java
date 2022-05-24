package com.wjc;

import com.wjc.service.impl.BookServiceImpl;

public class App
{
    public static void main(String[] args) {
        BookServiceImpl bookService=new BookServiceImpl();
        bookService.save();
    }
}

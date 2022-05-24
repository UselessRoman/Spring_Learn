package com.wjc;

import com.wjc.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDIConstructor
{
    public static void main(String[] args) {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("ApplicationContext.xml");

        BookService bookService= (BookService) ctx.getBean("bookService");

        bookService.save();
    }
}

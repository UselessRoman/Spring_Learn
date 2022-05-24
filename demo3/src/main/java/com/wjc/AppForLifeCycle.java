package com.wjc;

import com.wjc.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ctx.registerShutdownHook();
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        // BookService bookService= (BookService) ctx.getBean("bookService");

        //bookService.save();

        bookDao.save();
        ctx.close();
    }
}

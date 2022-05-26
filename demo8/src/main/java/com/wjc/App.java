package com.wjc;

import com.wjc.config.SpringConfig;
import com.wjc.dao.BookDao;
import com.wjc.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//
//        bookDao.save();

        BookService bookService=ctx.getBean(BookService.class);

        bookService.save();
    }
}

package com.wjc;

import com.wjc.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppIOC {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//         BookDao bookDao= (BookDao) ctx.getBean("bookDao");
//         bookDao.save();
        BookService bookService = (BookService) ctx.getBean("bookServiceDao");
        bookService.save();
    }
}

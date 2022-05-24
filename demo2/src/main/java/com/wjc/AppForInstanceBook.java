package com.wjc;

import com.wjc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook
{

//    使用构造方法来实例化Bean
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookDao bookDao= (BookDao) ctx.getBean("bookDao");

        bookDao.save();
    }
}

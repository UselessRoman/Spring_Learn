package com.wjc;

import com.wjc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    //实例化工厂来实例化Bean
    public static void main(String[] args) {
//        UserDaoFactory userDaoFactory=new UserDaoFactory();
//        UserDao userDao=userDaoFactory.getUserDao();
//        userDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save();
    }
}

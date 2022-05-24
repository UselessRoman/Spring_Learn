package com.wjc;

import com.wjc.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder
{
//    静态工厂实例化Bean
    public static void main(String[] args) {
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        OrderDao orderDao= (OrderDao) ctx.getBean("orderDao");
        orderDao.save();
    }
}

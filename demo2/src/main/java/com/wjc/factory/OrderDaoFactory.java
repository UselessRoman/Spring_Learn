package com.wjc.factory;

import com.wjc.dao.OrderDao;
import com.wjc.dao.impl.OrderDaoImpl;

public class OrderDaoFactory
{
    public static OrderDao getOrderDao()
    {
        System.out.println( " Order Factory running");
        return new OrderDaoImpl();
    }
}

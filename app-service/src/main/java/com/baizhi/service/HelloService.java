package com.baizhi.service;

import com.baizhi.dao.HellDao;

public class HelloService {
    public String hello(String name){
        HellDao hellDao = new HellDao();
        return hellDao.sayHello("zs");
    }
}

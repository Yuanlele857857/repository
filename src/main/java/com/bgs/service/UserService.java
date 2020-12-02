package com.bgs.service;

import com.bgs.bean.User;
import com.bgs.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

     @Autowired// 注入Spring容器中的bean对象
    private UserDao userDao;

    public List<User> queryUserList() {
        // 调用userDAO中的方法进行查询
        return this.userDao.queryUserList();
    }

}


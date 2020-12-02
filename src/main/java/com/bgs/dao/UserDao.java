package com.bgs.dao;

import com.bgs.bean.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> queryUserList(){
        List<User> list = new ArrayList<User>();

        for (int i = 0; i < 5; i++) {

            User user = new User();
            user.setAge(10+i);

            user.setPassword("123"+i);

            user.setUsername("zs"+i);

            list.add(user);

        }

        return list;
    }

}

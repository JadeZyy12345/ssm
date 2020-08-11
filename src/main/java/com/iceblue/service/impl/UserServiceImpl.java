package com.iceblue.service.impl;

import com.iceblue.dao.UserMapper;
import com.iceblue.pojo.User;
import com.iceblue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
     private UserMapper userMapper;

    @Override
    public void addUser(User user){
        userMapper.addUser(user);
    }

    @Override
    public User selectUserById(int id) {
        User user= userMapper.selectUserById(id);
        return user;
    }

    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public User queryUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> queryAllUser() {
        List<User> userList=userMapper.queryAllUser();
        return userList;
    }


}

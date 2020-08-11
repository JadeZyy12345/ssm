package com.iceblue.service;

import com.iceblue.pojo.User;

import java.util.List;


public interface UserService {
     void addUser(User user);

     User selectUserById(int id);

     User login(User user);

     User queryUserByEmail(String email);

     List<User> queryAllUser();
}

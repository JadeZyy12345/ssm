package com.iceblue.dao;

import com.iceblue.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    //添加用户
    @Insert(value = "INSERT INTO user (id,username,password,email) values (#{id},#{username},#{password},#{email})")
     void addUser(User user);

    //根据id查询用户
    @Select(value = "SELECT * FROM USER WHERE id=#{id}")
    User selectUserById(int id);

    @Select(value = "SELECT * FROM USER")
    List<User> queryAllUser();
}

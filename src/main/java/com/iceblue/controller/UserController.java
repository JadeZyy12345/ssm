package com.iceblue.controller;

import com.iceblue.pojo.User;
import com.iceblue.service.UserService;
import com.iceblue.utils.RandomId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    public UserService userService;


    @RequestMapping("/adddUser")
    public String addUser(User user){
        System.out.println(RandomId.getUniqueId());
        user.setId(RandomId.getUniqueId());
        userService.addUser(user);
        return "success";

    }


    public ModelAndView login(User user){
        ModelAndView mv=new ModelAndView();
    if(user.getEmail()!=null&&user.getPassword()!=null){
          User sessionUser=userService.login(user);
          mv.addObject("sessionUser",sessionUser);
          return mv;
        }else{
           String MSG="邮箱或密码不正确";
           mv.addObject("MSG",MSG);
        }
        mv.setViewName("success");
        return mv;
    }

    public String queryUserByEmail(String email){
        User user;
        user = userService.queryUserByEmail(email);
        if(user==null){

        }else{
            String MSG="邮箱已被注册";
        }
        return "success";
    }

    @RequestMapping("/queryAllUser")
    public ModelAndView queryAllUser(){
        ModelAndView mv= new ModelAndView();
        List<User> userList=userService.queryAllUser();
        mv.addObject("userList",userList);
        mv.setViewName("success");
        return mv;
    }



    @RequestMapping("/toIndex")
    public String toIndex(){
        System.out.println("toIndex");
        return "all-admin-index";
    }

}

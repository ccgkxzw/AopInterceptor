package com.xzw.interceter.controller;

import com.xzw.interceter.mapper.UserMapper;
import com.xzw.interceter.pojo.User;
import com.xzw.interceter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/slave")
    @ResponseBody
    public User test01(){
        String name="测试用户007";
        User users=userService.getUserSlave(name);
        return  users;
    }

    @RequestMapping("/master")
    @ResponseBody
    public User test02(){
        String name="测试用户007";
        User users=userService.getUserMaster(name);
        return users;
    }
    @ResponseBody
    @RequestMapping("/test")
    public User Hello(){
        String name="测试用户007";
        User user = userService.getUser(name);
        return user;
    }
}

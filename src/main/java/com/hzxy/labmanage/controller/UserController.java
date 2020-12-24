package com.hzxy.labmanage.controller;

import com.hzxy.labmanage.model.User;
import com.hzxy.labmanage.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/login")
    public User login(User user){
        return userService.Login(user.getUname(),user.getUpassword());
    }
}

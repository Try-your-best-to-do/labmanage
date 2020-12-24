package com.hzxy.labmanage.service.impl;

import com.hzxy.labmanage.dao.UserMapper;
import com.hzxy.labmanage.model.User;
import com.hzxy.labmanage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User Login(String username, String password) {
        try{
            User user = userMapper.selectByUsername(username);
            if (user!=null){
                if (user.getUpassword().equals(password)){
                    return user;
                }

            }else {
                return null;
            }
        }catch (Exception e){

        }
        return null;
    }
}

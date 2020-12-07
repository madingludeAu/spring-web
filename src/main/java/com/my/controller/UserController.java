package com.my.controller;

import com.my.domain.User;
import com.my.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller("/user/")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("list")
    public List<User> list(){
        return userMapper.selectAll();
    }
}

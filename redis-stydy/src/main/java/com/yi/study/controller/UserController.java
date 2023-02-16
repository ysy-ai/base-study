package com.yi.study.controller;

import com.yi.study.entity.User;
import com.yi.study.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ysy
 * @Date 2023/2/16
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping("/update")
    @ResponseBody
    public int updateUser(){
        userService.updateUserAge();
        return 1;
    }
}

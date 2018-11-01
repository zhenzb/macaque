package com.example.macaque.controller;

import com.example.macaque.model.User;
import com.example.macaque.service.UserService;
import com.example.macaque.utils.ResultJSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author yanhuo
 * @Date 2018/10/31 18:20
 * @Version 1.0
 **/
@RestController
@RequestMapping("/main/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findUser",method = RequestMethod.GET)
    public String findUser(User user){
        User userResult = userService.getUser(user.getUserName(), user.getPassword());
        return ResultJSONObject.success(userResult);
    }
}

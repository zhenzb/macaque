package com.example.macaque.service;

import com.example.macaque.dao.UserJPA;
import com.example.macaque.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author yanhuo
 * @Date 2018/10/31 18:17
 * @Version 1.0
 **/
@Service
public class UserService {
    @Autowired
    private UserJPA userJPA;

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public User getUser(String userName,String password){
       return userJPA.findUserByUserNameAndPassword(userName,password);
    }
}

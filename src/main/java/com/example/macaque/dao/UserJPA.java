package com.example.macaque.dao;

import com.example.macaque.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserJPA extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>,Serializable{
    /**
     * 管理人员登录
     * @param userName
     * @param password
     * @return
     */
    User findUserByUserNameAndPassword(String userName,String password);
}

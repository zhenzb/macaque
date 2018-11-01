package com.example.macaque.model;

import javax.persistence.*;

/**
 * @ClassName User
 * @Description TODO
 * @Author yanhuo
 * @Date 2018/10/30 10:19
 * @Version 1.0
 **/
@Entity
@Table(name="t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="user_name")
    private String userName;
    @Column(name = "pass_word")
    private String password;

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

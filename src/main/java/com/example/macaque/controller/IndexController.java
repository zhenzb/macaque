package com.example.macaque.controller;

import com.example.macaque.dao.UserJPA;
import com.example.macaque.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author yanhuo
 * @Date 2018/10/30 9:49
 * @Version 1.0
 **/
@Controller
@RequestMapping("/main")
public class IndexController {

    @Autowired
    private UserJPA userJPA;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("index");
        mv.addObject("name","欢迎光临！");
        return mv;
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(ModelAndView mv){
        mv.setViewName("html/login");
        return mv;
    }
    @RequestMapping(value = "/companyProfile",method = RequestMethod.GET)
    public ModelAndView companyProfile(ModelAndView mv){
        mv.setViewName("html/companyProfile");
        return mv;
    }
    @RequestMapping(value = "/news",method = RequestMethod.GET)
    public ModelAndView news(ModelAndView mv){
        mv.setViewName("html/news");
        return mv;
    }
    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public ModelAndView product(ModelAndView mv){
        mv.setViewName("html/product");
        return mv;
    }
    @RequestMapping(value = "/shili",method = RequestMethod.GET)
    public ModelAndView shili(ModelAndView mv){
        mv.setViewName("html/shili");
        return mv;
    }
    @RequestMapping(value = "/recruit",method = RequestMethod.GET)
    public ModelAndView recruit(ModelAndView mv){
        mv.setViewName("html/recruit");
        return mv;
    }
    @RequestMapping(value = "/services",method = RequestMethod.GET)
    public ModelAndView services(ModelAndView mv){
        mv.setViewName("html/services");
        return mv;
    }
    @RequestMapping(value = "/userSave",method = RequestMethod.GET)
    public User save(User user){
        User resultUser = userJPA.save(user);
        return resultUser;
    }
}

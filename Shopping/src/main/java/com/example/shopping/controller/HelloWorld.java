package com.example.shopping.controller;

import com.example.shopping.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "nickname")String name,@RequestParam(value = "telephone" ,required = true) String phone){
        System.out.println("nickname = " + name);
        System.out.println("telephone =" + phone);
        return "Get請求";
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.POST)
    public String hello2(String name,String phone){
        System.out.println("nickname = " + name);
        System.out.println("telephone =" + phone);
        return "Post請求";
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    public String hello3(@RequestBody User user){
        System.out.println(user);
        return "Post請求";
    }
}
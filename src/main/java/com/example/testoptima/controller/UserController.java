package com.example.testoptima.controller;

import com.example.testoptima.entity.User;
import com.example.testoptima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/saveUser")
    public String save(@RequestParam String name){
        if (name!=null){
            userService.save(name);
        }
        return "SUCCESS";
    }
    @GetMapping(value = "/getUser")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}

package com.example.springboot.controller;

import com.example.springboot.model.User;
import com.example.springboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {


    private UserServiceImpl service;

    public  UserController(){}

    @Autowired
    public UserController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public String getRoot(@AuthenticationPrincipal User user, ModelMap model){
        model.addAttribute("user", user);
        return "view/userInformation";
    }


}
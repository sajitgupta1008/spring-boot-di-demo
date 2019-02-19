package com.example.springbootdemo.controllers;

import com.example.springbootdemo.services.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerFirst {
    
    @Autowired
    public GreetService greetingServiceImpl;
    
    public String sayHello() {
        return greetingServiceImpl.hello();
    }
    
}

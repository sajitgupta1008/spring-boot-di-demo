package com.example.springbootdemo.controllers;

import com.example.springbootdemo.services.GreetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ControllerSecond {
    
    private final GreetService service;
    
    //To resolve multiple dependencies of same type, either use Qualifier or Primary
    // Dependencies are 1st resolved by type and then by name
    public ControllerSecond(@Qualifier("greetingServiceImpl2") GreetService service) {
        this.service = service;
    }
    
    public String sayHello() {
        return service.hello();
    }
    
}

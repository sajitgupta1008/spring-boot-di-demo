package com.example.springbootdemo.services;

import org.springframework.stereotype.Service;

public class GreetingServiceImpl2 implements GreetService {
   
    @Override
    public String hello() {
        return "another";
    }
}

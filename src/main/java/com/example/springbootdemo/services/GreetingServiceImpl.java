package com.example.springbootdemo.services;

import org.springframework.stereotype.Service;

public class GreetingServiceImpl implements GreetService {
   
    @Override
    public String hello() {
        return "this is fake service";
    }
}


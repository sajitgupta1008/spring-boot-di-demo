package com.example.springbootdemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Profile("es")
@Service
public class GreetingServiceImpl2 implements GreetService {
   
    @Override
    public String hello() {
        return "another";
    }
}

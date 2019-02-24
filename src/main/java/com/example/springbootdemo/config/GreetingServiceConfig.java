package com.example.springbootdemo.config;

import com.example.springbootdemo.services.GreetService;
import com.example.springbootdemo.services.GreetingServiceImpl;
import com.example.springbootdemo.services.GreetingServiceImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {
    
    @Bean("greetingServiceImpl")
    GreetService firstGreetingService() {
        return new GreetingServiceImpl();
    }
    
    @Bean("greetingServiceImpl2")
    GreetService secondGreetingService() {
        return new GreetingServiceImpl2();
    }
    
}

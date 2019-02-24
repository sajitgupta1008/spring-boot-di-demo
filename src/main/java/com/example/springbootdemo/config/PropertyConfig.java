package com.example.springbootdemo.config;

import com.example.springbootdemo.FakeDataSource;
import com.example.springbootdemo.JmsSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
    
    @Value("${db.username}")
    String userName;
    
    @Value("${db.password}")
    String password;
    
    @Bean
    FakeDataSource fakeDataSource() {
        return new FakeDataSource(userName, password);
    }
    
    @Bean
    JmsSource jmsSource(@Value("${user.name}") String user,
                        @Value("${user.url}") String url) {
        return new JmsSource(user, url);
    }
    
    @Bean
    static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
}

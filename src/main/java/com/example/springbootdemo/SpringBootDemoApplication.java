package com.example.springbootdemo;

import com.example.springbootdemo.controllers.ControllerFirst;
import com.example.springbootdemo.controllers.ControllerSecond;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
		ControllerFirst controller = ctx.getBean(ControllerFirst.class);
		
		System.out.println(controller.sayHello());
		System.out.println(ctx.getBean(ControllerSecond.class).sayHello());
		
		System.out.println("\nfake data source");
		FakeDataSource bean = ctx.getBean(FakeDataSource.class);
		System.out.println(bean.getPassword());
		
		System.out.println("\nfake jms source");
		System.out.println(ctx.getBean(JmsSource.class).user);
	}

}


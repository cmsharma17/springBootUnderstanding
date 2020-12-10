package com.cms.SpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =  SpringApplication.run(SpringBootExampleApplication.class, args);
		
		System.out.println("Welcome to boot..");
		
		Alien a = applicationContext.getBean(Alien.class);
		
		a.show();
		
		//Alien a1 = applicationContext.getBean(Alien.class);
		
		//a1.show();
	}

}

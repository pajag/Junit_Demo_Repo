package com.example.junit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:env.properties")
public class SecondJUnitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondJUnitApplication.class, args);
	}

}

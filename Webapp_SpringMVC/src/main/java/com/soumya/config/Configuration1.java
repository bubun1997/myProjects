package com.soumya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.soumya.entity.Student;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.soumya")
public class Configuration1 {
	
	
	public Configuration1() {
		
		System.out.println("Config 1 obj created by container");
	}
	
	@Bean
	public Student getStudent() {
		
		System.out.println("Student bean...");
		return new Student();
	}

}

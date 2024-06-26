package com.soumya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.soumya.entity.Laptop;

@Configuration
public class Configuration2 {
	
    public Configuration2() {
		
		System.out.println("Config 2 obj created by container");
	}
	
	@Bean
	public Laptop getLaptop() {
		
		System.out.println("Laptop bean...");
		return new Laptop();
	}

}

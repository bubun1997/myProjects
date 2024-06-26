package com.soumya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.soumya.entity.Desktop;
import com.soumya.entity.Device;


@Configuration
public class MyConfig {
	
	@Bean
	public Device getDevice() {
		
		return Desktop.
				builder().
				deviceName("Laptop").
				devicePrice(45000.00).build();
	}

}

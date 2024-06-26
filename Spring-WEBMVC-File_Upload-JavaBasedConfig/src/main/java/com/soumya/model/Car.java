package com.soumya.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Car {
	
	private Long carId;
	
	private String carName;
	
	private int carPrice;
	
	private CommonsMultipartFile myFile;
	

}

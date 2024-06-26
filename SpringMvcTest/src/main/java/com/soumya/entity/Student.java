package com.soumya.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Student {
	
	private Long studentId;
	
	private String studentName;
	
	private String email;
	
	private String mobileNumber;
	
	

}

package com.soumya.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResourceNotFoundException  extends RuntimeException {
	
	
	private String message;
	
	

	

}

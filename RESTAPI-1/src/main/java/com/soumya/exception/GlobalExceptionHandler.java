package com.soumya.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> getExceptionMessage(ResourceNotFoundException ex){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
	}

}

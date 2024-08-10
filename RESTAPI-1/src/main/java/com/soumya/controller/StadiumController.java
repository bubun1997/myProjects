package com.soumya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.entity.Stadium;
import com.soumya.service.StadiumService;

@RestController
@RequestMapping("/stadium")
public class StadiumController {
	
	@Autowired
	private StadiumService stadiumService;
	
	@PostMapping
	public ResponseEntity<Stadium> addStadium(@RequestBody Stadium stadium){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(stadiumService.addStadium(stadium));
	}
	
	@GetMapping
	public ResponseEntity<List<Stadium>> getAllStadiums(){
		
		return ResponseEntity.ok(stadiumService.getAllStadium());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Stadium> getStadiumById(@PathVariable Long id){
		
		return ResponseEntity.ok(stadiumService.getStadiumById(id));
	}

}

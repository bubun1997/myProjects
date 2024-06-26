package com.soumya.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stadium {
	
	private Long stadiumId;
	
	private String stadiumName;
	
	private String state;
	
	private String city;
	
	private Long capacity;
	
	

}

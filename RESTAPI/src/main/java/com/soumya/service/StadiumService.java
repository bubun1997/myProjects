package com.soumya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.soumya.entity.Stadium;
import com.soumya.exception.ResourceNotFoundException;

@Service
public class StadiumService {
	
	private static final List<Stadium> STADIUM_LIST;
	
	static {
		
		STADIUM_LIST = new ArrayList<Stadium>();
	}
	
	public Stadium addStadium(Stadium stadium) {
		
		STADIUM_LIST.add(stadium);
		return stadium;
	}
	
	public List<Stadium> getAllStadium(){
		
		return STADIUM_LIST;
	}

	public Stadium getStadiumById(Long id) {
		
		return STADIUM_LIST.stream().
				            filter( stadium -> stadium.getStadiumId().equals(id)).
				            findAny().orElseThrow( () -> new ResourceNotFoundException("Resource not found with id : "+id));
	}
	
	
}

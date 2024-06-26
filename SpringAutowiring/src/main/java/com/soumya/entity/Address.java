package com.soumya.entity;

public class Address {
	
	private String state;
	
	private String city;
	
	private Long pinCode;

	public Address(String city, Long pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}

	public Address() {
		
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public Long getPinCode() {
		return pinCode;
	}
	
	
	
	

}

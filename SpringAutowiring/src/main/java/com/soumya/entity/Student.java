package com.soumya.entity;

public class Student {
	
	private Integer rollNumber;
	
	private String studentName;
	
	private Address address;

	public Student(Integer rollNumber, Address address) {
		super();
		this.rollNumber = rollNumber;
		this.address = address;
	}

	public Student() {
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		
		return "Name : "+
				this.studentName+" , Address : "+
				this.address.getCity()+" # "+this.address.getPinCode();
	}
	
	
	
	

}

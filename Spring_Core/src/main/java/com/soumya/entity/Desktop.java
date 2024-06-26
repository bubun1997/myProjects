package com.soumya.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Desktop implements Device {

	private String deviceName;
	
	private Double devicePrice;

	@Override
	public String getDeviceName() {
		
		System.out.println("Device Name "+this.deviceName);
		return this.deviceName;
	}

	@Override
	public Double getDevicePrice() {
		
		System.out.println("Device Price "+this.devicePrice);
		return this.devicePrice;
	}
	
	

}

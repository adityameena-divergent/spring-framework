package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {

	@Autowired
	@Qualifier("car")
	Car car;

	@Override
	public String toString() {
		return "Vehicle [car=" + car.getModel() + "]";
	}
	
	
	
}

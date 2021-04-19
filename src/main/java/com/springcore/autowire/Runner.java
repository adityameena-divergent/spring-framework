package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/config.xml");
		
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

		System.out.println(vehicle);
		
	}

}

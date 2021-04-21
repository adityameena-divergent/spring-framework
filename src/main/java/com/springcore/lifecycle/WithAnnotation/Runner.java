package com.springcore.lifecycle.WithAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/WithAnnotation/config.xml");
	
		Plane plane = context.getBean("plane", Plane.class);
		
		System.out.println(plane);
		
		context.registerShutdownHook();
		
	}

}

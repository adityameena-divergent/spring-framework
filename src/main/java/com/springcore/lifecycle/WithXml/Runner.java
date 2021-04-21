package com.springcore.lifecycle.WithXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/WithXml/config.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student);
		
		context.registerShutdownHook();
		
	}

}

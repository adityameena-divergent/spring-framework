package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Setter Injection
 *
 */
public class Runner {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		
		Employee employee = context.getBean("employee", Employee.class);
		
		System.out.println(employee);
		
	}
	
}

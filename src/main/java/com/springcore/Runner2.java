package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Prototype Scope
 * Constructor Injection
 *
 */
public class Runner2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		
		Student student1 = context.getBean("student", Student.class);
		
		Student student2 = context.getBean("student", Student.class);

		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
	}

}

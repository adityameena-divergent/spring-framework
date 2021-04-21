package com.springcore.lifecycle.WithInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/WithInterface/config.xml");
		
		Gun gun = context.getBean("gun", Gun.class);

		System.out.println(gun);
		
		context.registerShutdownHook();
	}

}

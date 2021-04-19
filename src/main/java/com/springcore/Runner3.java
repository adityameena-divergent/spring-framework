package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Factory Injection
 *
 */

public class Runner3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		
		ClientService clientService1 = context.getBean("clientService", ClientService.class);

		ClientService clientService2 = context.getBean("clientService", ClientService.class);

		
		System.out.println(clientService1.hashCode());
		System.out.println(clientService2.hashCode());
		
	}

}

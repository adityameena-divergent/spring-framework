package com.springcore.lifecycle.WithXml;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student {
	
	private int id;
	private String name;
	
	static Logger logger;
	static ConsoleHandler handler;

	static {
		logger = Logger.getAnonymousLogger();
		logger.setLevel(Level.FINE);
		handler = new ConsoleHandler();
		handler.setLevel(Level.FINE);
		logger.addHandler(handler);
	}
	
	public Student() {
		logger.log(Level.FINE, "Constructor");
	}
	
	public void init() {
		logger.log(Level.FINE, "Init Method");
	}
	
	public void destroy() {
		logger.log(Level.FINE, "Destroy Method");
	}
	
	public void setId(int id) {
		logger.log(Level.FINE, "Setting Student Id");
		this.id = id;
	}
	
	public void setName(String name) {
		logger.log(Level.FINE, "Setting Student Name");
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}

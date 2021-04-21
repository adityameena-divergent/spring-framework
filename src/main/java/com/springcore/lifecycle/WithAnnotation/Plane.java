package com.springcore.lifecycle.WithAnnotation;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Plane {

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
	
	public Plane() {
		logger.log(Level.FINE, "Constructor");
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Plane [name=" + name + "]";
	}
	
	@PostConstruct
	public void init() {
		logger.log(Level.FINE, "Init Method");
	}
	
	@PreDestroy
	public void destroy() {
		logger.log(Level.FINE, "Destroy Method");
	}
	
}

package com.springcore.lifecycle.WithInterface;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Gun implements InitializingBean, DisposableBean {

	private String status;

	static Logger logger;
	static ConsoleHandler handler;

	public Gun() {
		logger.log(Level.FINE, "Constructor");
	}
	
	static {
		logger = Logger.getAnonymousLogger();
		logger.setLevel(Level.FINE);
		handler = new ConsoleHandler();
		handler.setLevel(Level.FINE);
		logger.addHandler(handler);
	}


	public void setStatus(String status) {
		logger.log(Level.FINE, "Setting status");
		this.status = status;
	}



	@Override
	public String toString() {
		return "Gun [status=" + status + "]";
	}


	public void afterPropertiesSet() throws Exception {
		logger.log(Level.FINE, "init method");
	}
	

	public void destroy() throws Exception {
		logger.log(Level.FINE, "destroy method");
	}	
	
}

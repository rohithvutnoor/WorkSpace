package com.springBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigAB.class);
		A a = ctx.getBean(A.class);
		a.setMessage("Hello from A");
		a.getMessage();
		
		B b = ctx.getBean(B.class);
		b.setMessage("Hello from B");
		b.getMessage();
	}

}

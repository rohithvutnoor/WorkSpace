package com.springBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(A.class)
public class ConfigAB {
	
	@Bean
	public A a() {
		return new A(); 
	}
   @Bean
   public B b() {
      return new B(); 
   }
}

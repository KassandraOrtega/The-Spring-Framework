package com.kassandraortega.spring.aop.springaop;


import java.lang.System.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kassandraortega.spring.aop.springaop.business.Business1;
import com.kassandraortega.spring.aop.springaop.business.Business2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner{

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		((org.slf4j.Logger) logger).info(business1.calculateSomething());
		((org.slf4j.Logger) logger).info(business2.calculateSomething());
	}

}

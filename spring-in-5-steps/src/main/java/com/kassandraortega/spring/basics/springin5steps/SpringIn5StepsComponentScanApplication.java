package com.kassandraortega.spring.basics.springin5steps;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.kassandraortega.spring.basics.componentscan.ComponentDAO;
import com.kassandraortega.spring.basics.springin5steps.scope.PersonDAO;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@ComponentScan("com.kassandraortega.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDao);
	}
}

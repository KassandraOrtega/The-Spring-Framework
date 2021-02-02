package com.kassandraortega.spring.basics.springin5steps;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kassandraortega.spring.basics.componentscan.ComponentDAO;

import ch.qos.logback.classic.Logger;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext 
				= new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class)) {
			ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", componentDAO);
		}
	}
}

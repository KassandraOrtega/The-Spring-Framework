package com.kassandraortega.spring.basics.springin5steps;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kassandraortega.spring.basics.springin5steps.cdi.SomeCdiBusiness;

import ch.qos.logback.classic.Logger;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)) {
			SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

			LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
		}
	}
}

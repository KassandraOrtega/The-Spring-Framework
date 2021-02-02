package com.kassandraortega.spring.basics.springin5steps;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kassandraortega.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import com.kassandraortega.spring.basics.springin5steps.scope.PersonDAO;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
	}
}

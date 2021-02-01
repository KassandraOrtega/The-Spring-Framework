package com.kassandraortega.spring.basics.springin5steps;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kassandraortega.spring.basics.springin5steps.scope.PersonDAO;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}

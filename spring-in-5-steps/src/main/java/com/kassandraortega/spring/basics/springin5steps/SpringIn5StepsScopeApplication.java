package com.kassandraortega.spring.basics.springin5steps;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kassandraortega.spring.basics.springin5steps.scope.PersonDAO;

import ch.qos.logback.classic.Logger;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentScanApplication.class)) {

			PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

			PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
			LOGGER.info("{}", personDao.getJdbcConnection());

			LOGGER.info("{}", personDao2);
			LOGGER.info("{}", personDao.getJdbcConnection());
		}
	}
}

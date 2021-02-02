package com.kassandraortega.spring.basics.springin5steps;

import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kassandraortega.spring.basics.springin5steps.xml.XmlPersonDAO;

import ch.qos.logback.classic.Logger;

public class SpringIn5StepsXMLContextApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
		
		LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
		
		XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
		//[xmljdbcconnection, xmlpersondai] -> 2 beans
		
		LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
		}
	}
}

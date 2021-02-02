package com.kassandraortega.spring.basics.springin5steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kassandraortega.spring.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsXMLContextApplication {

	// What are the beans? => Find using the @Component
	// What are the dependencies of a bean? => Find using @Autowired
	// Where to search for beans? => No need because we are in the same package.
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] {124, 4, 6}, 3);
		//System.out.println(result);
		
		// Application Context
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
		
		XmlPersonDAO personDao = 
				applicationContext.getBean(XmlPersonDAO.class);
		
		System.out.println(personDao);
		System.out.println(personDao.getXmlJdbcConnection());
		}
	}
}

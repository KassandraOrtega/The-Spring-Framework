package com.kassandraortega.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kassandraortega.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	// What are the beans? => Find using the @Component
	// What are the dependencies of a bean? => Find using @Autowired
	// Where to search for beans? => No need because we are in the same package.
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] {124, 4, 6}, 3);
		//System.out.println(result);
		
		// Application Context
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)){
		
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch1 = 
				applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch + "\n" +binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] {124, 4, 6}, 3);
		
		System.out.println(result);
		
		//applicationContext.close();
		}
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}

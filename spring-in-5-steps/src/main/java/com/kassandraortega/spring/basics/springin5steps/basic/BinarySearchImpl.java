package com.kassandraortega.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Default is singleton, use scope to change it to prototype.
public class BinarySearchImpl {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array.
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
}

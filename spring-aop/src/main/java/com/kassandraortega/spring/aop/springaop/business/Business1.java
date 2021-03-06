package com.kassandraortega.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kassandraortega.spring.aop.springaop.aspect.TrackTime;
import com.kassandraortega.spring.aop.springaop.data.Dao1;

@Service
public class Business1 {
	
	@Autowired
	private Dao1 dao1;
	
	@TrackTime
	public String calculateSomething(){
		//Business Logic
		return dao1.retrieveSomething();
	}
}

package com.kassandraortega.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
		this.someCdiDao = someCDIDAO;
	}
	
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCdiDao.getData();
		
		for(int value : data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}

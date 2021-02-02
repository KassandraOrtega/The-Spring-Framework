package com.kassandraortega.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao SomeCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return SomeCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
		this.SomeCdiDao = someCDIDAO;
	}
}

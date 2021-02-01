package com.kassandraortega.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kassandraortega.spring.basics.springin5steps.scope.JdbcConnection;

@Component
public class ComponentDAO {
	
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}

package com.kassandraortega.database.databasedemo;

import java.lang.System.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kassandraortega.database.databasedemo.jdbc.PersonJbdcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJbdcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		((org.slf4j.Logger) logger).info("All users -> {}", dao.findAll());
		((org.slf4j.Logger) logger).info("User id 10001 -> {}", dao.findById(10001));
		((org.slf4j.Logger) logger).info("Deleting 10002 -> No of Rows Deleted - {}", dao.deleteById(10002));
	}
}
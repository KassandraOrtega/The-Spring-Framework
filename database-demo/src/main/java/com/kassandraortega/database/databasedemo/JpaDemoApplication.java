package com.kassandraortega.database.databasedemo;

import java.lang.System.Logger;
import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kassandraortega.database.databasedemo.entity.Person;
import com.kassandraortega.database.databasedemo.jdbc.PersonJbdcDao;
import com.kassandraortega.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		((org.slf4j.Logger) logger).info("User id 10001 -> {}", repository.findById(10001));
		
		((org.slf4j.Logger) logger).info("Inserting -> {}", 
				repository.insert(new Person("Tara", "Berlin", new Date())));
		
		((org.slf4j.Logger) logger).info("Update 10003 -> {}", 
				repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));
		
		repository.deleteById(10002);

		((org.slf4j.Logger) logger).info("All users -> {}", repository.findAll());
	}
}
package com.kassandraortega.spring.aop.springaop.aspect;

import java.lang.System.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UseAccessAspect {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.kassandraortega.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		((org.slf4j.Logger) logger).info("Check for user access ");
		((org.slf4j.Logger) logger).info("Allowed execution for {}", joinPoint);
	}
}

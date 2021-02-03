package com.kassandraortega.spring.aop.springaop.aspect;

import java.lang.System.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	// PointCut - What kind of method calls I would intercept
	@Before("execution(* com.kassandraortega.spring.aop.springaop.data.*.*(..))")
	public void before(JoinPoint joinPoint) {
		// Advice
		((org.slf4j.Logger) logger).info("Check for user access ");
		((org.slf4j.Logger) logger).info("Allowed execution for {}", joinPoint);
	}
}
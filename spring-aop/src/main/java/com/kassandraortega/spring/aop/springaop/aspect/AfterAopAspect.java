package com.kassandraortega.spring.aop.springaop.aspect;

import java.lang.System.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(
			value = "com.kassandraortega.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		((org.slf4j.Logger) logger).info("{} returned with value {}", joinPoint, result);
	}
	
	@After(value = "com.kassandraortega.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinPoint) {
		((org.slf4j.Logger) logger).info("after execution of {}", joinPoint);
	}
}

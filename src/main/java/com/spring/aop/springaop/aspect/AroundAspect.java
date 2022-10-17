package com.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Around("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void afterReturning(ProceedingJoinPoint joinpoint, Object result) throws Throwable {

		// Start time = x;
		// allow execution of method
		// end time = y

		long startTime = System.currentTimeMillis();
		joinpoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;

		logger.info("Time taken by {} is {}", joinpoint, timeTaken);
	}

}

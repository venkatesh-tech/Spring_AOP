package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.*;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
//@EnableAspectJAutoProxy
@Aspect
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());

	// What kinds of method calls I would intercept
	// execution(* PACKAGE.*.*(..))

	@Before("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinpoint) {
		// What to do?
		logger.info("Intercepted Methd Calls - {}", joinpoint);
	}

}

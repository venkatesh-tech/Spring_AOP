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
public class AfterAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());

	// What kinds of method calls I would intercept
	// execution(* PACKAGE.*.*(..))

	@AfterReturning(value = "execution(* com.spring.aop.springaop.business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinpoint, Object result) {
		// What to do?
		logger.info("{} returned with value {}", joinpoint, result);
	}

	@AfterThrowing(value = "execution(* com.spring.aop.springaop.business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinpoint, Object exception) {
		// What to do?
		logger.info("{} returned with value {}", joinpoint, exception);
	}

	@After(value = "execution(* com.spring.aop.springaop.business.*.*(..))")
	public void after(JoinPoint joinpoint) {
		// What to do?
		logger.info("{} after execution of {}", joinpoint);
	}

}

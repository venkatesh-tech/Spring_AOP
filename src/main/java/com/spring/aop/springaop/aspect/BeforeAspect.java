package com.spring.aop.springaop.aspect;

import org.slf4j.*;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());

	// What kinds of method calls I would intercept
	public void before() {
		// What to do?
		logger.info("Intercepted Methd Calls {}");
	}

}

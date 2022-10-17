package com.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {

	}

	@Pointcut("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() { // use copy qualified name from mouse right click

	}

}

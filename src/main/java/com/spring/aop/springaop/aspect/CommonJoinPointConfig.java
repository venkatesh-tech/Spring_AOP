package com.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.spring.aop.springaop.data.*.*(..))") // with these pointcut data can be added
	public void dataLayerExecution() {
	}

	@Pointcut("execution(* com.spring.aop.springaop.business.*.*(..))") // with these pointcut business can be added
	public void businessLayerExecution() { // use copy qualified name from mouse right click
	}

	@Pointcut("execution(* com.spring.aop.springaop.business.*.*(..)) && execution(* com.spring.aop.springaop.business.*.*(..))")
	public void allLayerExecution() { // with these pointcut both business and data can be added
	}

	@Pointcut("bean(*dao*)") // Looks for any bean that contains name dao
	public void beanStartingWithDAO() {
	}

	@Pointcut("bean(dao*)") // Looks for any bean that contains name starts with dao
	public void beanconatiningWithDAO() {
	}

	@Pointcut("within(com.spring.aop.springaop.data.*.*(..))") // Looks for bean that contains in that package"
	public void beanWithinDAO() {
	}

	@Pointcut("@annotation(com.spring.aop.springaop.aspect.TrackTime)") // Looks for bean that contains in that package"
	public void trackTimeAnnotation() {
	}

}

package com.spring.aop.springaop;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.aop.springaop.business.*;

@SpringBootApplication
//@ComponentScan(basePackages = "{com.spring.aop.springaop.business,com.spring.aop.springaop.data}")
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	Business1 business1;

	@Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}

}

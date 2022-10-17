package com.spring.aop.springaop.aspect;

import java.lang.annotation.*;

//Methods
//Runtime
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

}

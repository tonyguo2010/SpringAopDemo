package com.seakie;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AopAspect {
	@Before("execution(public String getName())")
	void beforeGetNames() {
		System.out.println("Who is getting name?");
	}
}

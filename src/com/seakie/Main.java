package com.seakie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx 
			= new ClassPathXmlApplicationContext("configuration.xml");
		Something entity = ctx.getBean("someone", Something.class);
		entity.yell("Ah...");
		
		String name = entity.getName();
		System.out.println(name + " was yelling just now");
	}

}

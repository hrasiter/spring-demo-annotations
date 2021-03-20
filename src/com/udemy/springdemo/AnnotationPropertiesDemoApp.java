package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationPropertiesDemoApp {

	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from the context
		SwimmingCoach swimmingCoach = context.getBean("swimmingCoach", SwimmingCoach.class);
		
		//call some methods on the bean
		System.out.println(swimmingCoach.getEmail());
		System.out.println(swimmingCoach.getTeam());
		
		//close the context
		context.close();
	}

}

package com.udemy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCandDIPractice {

	public static void main(String[] args) {

			//load configuration
			AnnotationConfigApplicationContext context = 
					new AnnotationConfigApplicationContext(SportConfig.class);
			
			Coach theCoach = context.getBean("basketCoach", Coach.class);
			
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			
			context.close();
	}

}

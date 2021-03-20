package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive the bean from spring container
		Coach footballCoach = context.getBean("footballCoach", Coach.class);
		
		//call some methon on the bean
		System.out.println(footballCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}

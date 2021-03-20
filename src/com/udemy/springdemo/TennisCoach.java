package com.udemy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
//	@Autowired
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fs) {
		fortuneService = fs;
	}
	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void doMyStuff(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside doMyStuff method!");
//		this.fortuneService = fortuneService;
//	}


	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

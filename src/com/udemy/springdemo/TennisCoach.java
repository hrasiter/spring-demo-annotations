package com.udemy.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside doMyStartupStuff method");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach: inside doMyCleanupStuff method");
	}

//	@Autowired
//	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fs) {
//		System.out.println("TennisCoach: inside Autowired-constructor method");
//		fortuneService = fs;
//	}
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside Default-constructor method");
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

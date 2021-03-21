package com.udemy.springdemo;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String fortunes[] = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random myRandom = new Random();
	
	public RandomFortuneService() {
		System.out.println("\nRandomFortuneService: inside Default-constructor method.");
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}

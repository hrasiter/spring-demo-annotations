package com.udemy.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	private ArrayList<String> fortunes = new ArrayList<String>();
	
	private Random myRandom = new Random();
	
	@PostConstruct
	public void doMyInitialStuff() {
		System.out.println("DatabaseFortuneService: inside doMyInitialStuff method");
		try {
			File file = new File("src/fortunes.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String string = (String) scanner.nextLine();
				fortunes.add(string);
			}
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public DatabaseFortuneService() {
		System.out.println("DatabaseFortuneService: inside default constructor");	
	}
	
	@Override
	public String getFortune() {
		System.out.println(">> DatabaseFortuneService: inside getFotune method");
		int index = myRandom.nextInt(fortunes.size());
		return fortunes.get(index);
	}

}

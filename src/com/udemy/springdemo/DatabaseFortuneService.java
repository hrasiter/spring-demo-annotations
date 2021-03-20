package com.udemy.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	private ArrayList<String> fortunes = new ArrayList<String>();
	
	private Random myRandom = new Random();
	
	public DatabaseFortuneService() {
		
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
	
	@Override
	public String getFortune() {
		System.out.println(">> DatabaseFortuneService: inside getFotune method");
		int index = myRandom.nextInt(fortunes.size());
		return fortunes.get(index);
	}

}

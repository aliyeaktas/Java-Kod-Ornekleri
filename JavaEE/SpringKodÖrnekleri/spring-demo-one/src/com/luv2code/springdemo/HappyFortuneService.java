package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

	@Override
	public String getRandomFortune() {
		
		String[] fortuneExamples = {"fortune1", "fortune2", "fortune3"};
		
		int randomFortune = new Random().nextInt(fortuneExamples.length);
		
		return fortuneExamples[randomFortune];
	}

}

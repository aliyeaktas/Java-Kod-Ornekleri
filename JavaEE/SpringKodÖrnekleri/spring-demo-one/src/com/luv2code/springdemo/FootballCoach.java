package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	FortuneService fortuneService;
	
	public FootballCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice 60 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyRandomFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getRandomFortune();
	}

}

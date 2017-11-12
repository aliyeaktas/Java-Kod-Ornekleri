package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach : Inside the no-arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : Inside the setter method --setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : Inside the setter method --setTeam");
		this.team = team;
	}

	/*<bean id="myCricketCoach" class="com.luv2code.springdemo.CricketCoach">
		<property name="fortuneService" ref="myFortuneService"></property> 
    </bean>
    ile tan�mlan�r*/  
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : Inside the setter method --setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyRandomFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getRandomFortune();
	}

}

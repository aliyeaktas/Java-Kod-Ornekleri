package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach.getDailyRandomFortune());  //xml den al�yor
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getEmailAddress());  //propertiesten al�yor
		System.out.println(coach.getTeam());

		context.close();
	}

}

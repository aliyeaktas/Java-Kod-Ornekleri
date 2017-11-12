package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myBeanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Same object refernce: " + result);
		System.out.println("theCoach object : " + theCoach);
		System.out.println("alphaCoach : " + alphaCoach);

	}

}

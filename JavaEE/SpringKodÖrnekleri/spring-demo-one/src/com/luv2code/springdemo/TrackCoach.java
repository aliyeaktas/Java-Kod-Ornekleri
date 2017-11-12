package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//dependency injection 
	//dependency = helper
	private FortuneService fortuneService;
	
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: " + fortuneService.getFortune();
	}
	@Override
	public String getDailyRandomFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getRandomFortune();
	}
	
	/*When you are defining init and destroy methods should follow these rules

	The methods should be public void
	The methods should be no-arg, meaning they shouldn't accept any method arguments.
*/	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside the init method: doMyStartupStuff");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach : inside the destroy method: doMyCleanupStuff");
	}
	
	/*NOTE:
		For "prototype" scoped beans, Spring does not call the destroy method.  Gasp!  


		---

		In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean: 
		the container instantiates, configures, and otherwise assembles a prototype object, and hands it to the client, 
		with no further record of that prototype instance.

		Thus, although initialization lifecycle callback methods are called on all objects regardless of scope, 
		in the case of prototypes, configured destruction lifecycle callbacks are not called. 
		The client code must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding. */

}

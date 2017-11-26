package com.gerardocamilo.springdemo;

public class TrackCoach implements Coach {

	FortuneService myFortuneService;
	
	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService fortuneService){
		this.myFortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return this.myFortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside method - doMyStartupStuff");
	}
	
	// add an cleanup method
	/* For "prototype" scoped beans, Spring does not call the @PreDestroy (destroy-method) method. */
	public void doMyCleanupStuff(){
		System.out.println("TrackCoach: inside method - doMyCleanupStuff");
	}	
}

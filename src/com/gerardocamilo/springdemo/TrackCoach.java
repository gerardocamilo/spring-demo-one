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

}

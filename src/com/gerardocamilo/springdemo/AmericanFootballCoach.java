package com.gerardocamilo.springdemo;

public class AmericanFootballCoach implements Coach {

	FortuneService myFortuneService;
	
	public AmericanFootballCoach(){
		
	}
	
	public AmericanFootballCoach(FortuneService fortuneService){
		this.myFortuneService = fortuneService;
	}	
	
	@Override
	public String getDailyWorkout() {
		return "Throw 100 ballons";
	}

	@Override
	public String getDailyFortune() {
		return this.myFortuneService.getFortune();
	}

}

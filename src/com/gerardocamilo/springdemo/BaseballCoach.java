package com.gerardocamilo.springdemo;

public class BaseballCoach implements Coach{
	
	FortuneService theFortuneService;
	
	public BaseballCoach(){
		
	}
	
	public BaseballCoach(FortuneService fortuneService){
		this.theFortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune(){
		return this.theFortuneService.getFortune();
	}
	
}

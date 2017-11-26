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
	
	public void init(){
		System.out.println("\nBaseballCoach: inside method - init");
	}
	
	public void dispose(){
		System.out.println("\nBaseballCoach: inside method - dispose");
	}
}

package com.gerardocamilo.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public CricketCoach(){
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team){
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}

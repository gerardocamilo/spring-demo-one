package com.gerardocamilo.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {
			"A good way to keep healthy is to eat more Chinese food.",
			"A friend asks only for your time not your money.",
			"A smile is your passport into the hearts of others."
			};
	
	public RandomFortuneService(){

	}
	
	@Override
	public String getFortune() {
		Random rand = new Random();
		String fortune = fortunes[rand.nextInt(this.fortunes.length)];
		return fortune;
	}

}

package com.gerardocamilo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		Coach baseballCoach = context.getBean("myBaseballCoach", Coach.class);
		
		// print results
		
		// close context
		context.close();

	}

}

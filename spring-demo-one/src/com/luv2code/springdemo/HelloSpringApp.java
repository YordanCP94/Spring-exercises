package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		/*		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("soccerCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		*/
		
		//HappyFortuneService happyFortune = context.getBean("happyFortuneService", HappyFortuneService.class);
		//System.out.println(happyFortune.getFortune());
		
		BaseballCoach baseballCoach = context.getBean("baseballCoach", BaseballCoach.class);
		// close the context
		System.out.println("Before");
		context.close();
		System.out.println("After");
	}

}








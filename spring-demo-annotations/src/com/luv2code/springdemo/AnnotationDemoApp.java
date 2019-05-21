package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(soccerCoach.getDailyWorkout());
		
		System.out.println(tennisCoach.getDailyFortune());
		
		context.close();
	}
}

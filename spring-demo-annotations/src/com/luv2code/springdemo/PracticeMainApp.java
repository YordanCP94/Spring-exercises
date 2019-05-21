package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeMainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NewSportConfig.class);
		
		BasketCoach basketCoach = context.getBean("basketCoach", BasketCoach.class);
		
		System.out.println("BasketCoach: " + basketCoach.getDailyWorkout());
		System.out.println("BasketCoach: " + basketCoach.getDailyFortune());
	}

}

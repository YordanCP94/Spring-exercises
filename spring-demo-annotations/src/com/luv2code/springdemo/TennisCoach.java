package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside the tennisCoach constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method of tennisCoach");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

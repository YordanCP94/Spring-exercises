package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach {

	@Autowired
	@Qualifier("upsetFortuneService")
	private FortuneService fortuneService;
	
	public BasketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run back and forth with the ball";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}

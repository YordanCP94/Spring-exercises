package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Practice free kicks for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	};
}

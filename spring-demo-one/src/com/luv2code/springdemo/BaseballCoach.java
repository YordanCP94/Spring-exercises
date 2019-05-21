package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	public void init() {
		System.out.println("Code inside init method");
	}
	
	public void destroy() {
		System.out.println("Code inside destroy method");
	}
}

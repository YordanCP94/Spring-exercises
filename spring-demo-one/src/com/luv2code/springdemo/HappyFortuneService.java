package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HappyFortuneService implements FortuneService {


	@Override
	public String getFortune() {
		String fortuneArray[] = {"You're gonna be lucky","You're gonna be so lucky","Today is your luckiest day"};
		
		Random random = new Random();
		
		return fortuneArray[random.ints(0,3).findFirst().getAsInt()];
	}

}

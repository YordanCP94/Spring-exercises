package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] randomFortuneArray = {"Beware of the wolf in sheep's clothing", 
											"Diligence is the mother of luck", 
											"The journey is the reward"};
	private Random random = new Random();
	@Override
	public String getFortune() {
		int index = random.nextInt(randomFortuneArray.length);
		return randomFortuneArray[index];
	}

}

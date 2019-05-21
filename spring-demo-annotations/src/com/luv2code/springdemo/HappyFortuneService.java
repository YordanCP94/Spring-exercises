package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	private String fortune;
	
	@PostConstruct
	public void onInit() {
		String[] randomFortuneArray = {"Beware of the wolf in sheep's clothing", 
				"Diligence is the mother of luck", 
				"The journey is the reward"};
		
		Random random = new Random();
		int index = random.nextInt(randomFortuneArray.length);
		
		this.fortune = randomFortuneArray[index];
	}
	
	@Override
	public String getFortune() {
		return this.fortune;
	}

}

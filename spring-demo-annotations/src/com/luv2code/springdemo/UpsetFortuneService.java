package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UpsetFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is an upset day!";
	}

}

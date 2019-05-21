package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class NewSportConfig {
	@Bean
	public UpsetFortuneService upsetService() {
		return new UpsetFortuneService();
	}
	
	@Bean
	public Coach basketCoach() {
		return new BasketCoach(upsetService());
	}
}

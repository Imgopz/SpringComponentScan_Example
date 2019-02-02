package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// define bean for our good fortune service
	@Bean
	public FortuneService goodFortuneService() { // Bean id here is goodFortuneService
		
		return new GoodFortuneService();
		
	}
	
	// define bean for our swimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(goodFortuneService()); // calling bean method from above method
		
	}
		
}

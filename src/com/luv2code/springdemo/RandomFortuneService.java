package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	// Create a array of strings
	private String[] data = {
			"Good Luck",
			"May God Bless You",
			"You are this multiverse's strongest"
	};
	
	// create random number gen
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		// Pick a random string from the array
		int index = myRandom.nextInt(data.length);	
		String theFortune = data[index];
		return theFortune;
		
	}

}

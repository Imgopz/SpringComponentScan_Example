package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") // Spring will automatically register this bean (i.e: Object)
@Component // The default bean id will be tennisCoach
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Practice your backend volley";
		
	}

}

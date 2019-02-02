package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") // Spring will automatically register this bean (i.e: Object)
@Component // The default bean id will be tennisCoach
@Scope("prototype")
public class TennisCoach implements Coach {
	
	/*
	@Autowired
	@Qualifier("randomFortuneService") // Qualifier annotations with default bean id will help this autowired field to choose exact component in this case fortuneService
	// In case of RESTFortuneService, the default beanId wont work because the name contains all the first five chars capital, so feel free to use custom bean id
	// Field Injection, using Java Tech called Reflection
	private FortuneService fortuneService;
	*/
	private FortuneService fortuneService;
	
	// define default constructor to test
	public TennisCoach() {
		
		System.out.println(">> TennisCoach: Inside default constructor");
		
	}
	
	@Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
        
        fortuneService = theFortuneService;
    }
	
	
	/*
	@Autowired 
  	// Constructor Injection - There is only one fortune service which implements the interface FortuneServce i.e. HappyFortuneService. So this Autowire annotation just assign it to theForutnueService and we can call te function insed getDailyFortune as fortuneService.getFortune() as below 
	public TennisCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
				
	} 
	*/
	
	/*
	// define Setter mothod for setter Injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		
		System.out.println(">> TennisCoach: Inside setFortuneService() method");
		fortuneService = theFortuneService;
		
	}
	*/
	
	/*	
	// Autowire any method like setter method - Method Injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		
		System.out.println(">> TennisCoach: Inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
		
	}
	*/
	
	@Override
	public String getDailyWorkout() {

		return "Practice your backend volley";
		
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
		
	}

}

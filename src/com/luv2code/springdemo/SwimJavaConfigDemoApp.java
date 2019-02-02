package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author Gopz
 *
 */
public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read the spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily forutne
		System.out.println(theCoach.getDailyFortune());
		
		// call our new methods...has the prov values injected
		System.out.println("Email: "+theCoach.getEmail());
		
		System.out.println("Email: "+theCoach.getTeam());
		
		// close the context
		context.close();

	}

}

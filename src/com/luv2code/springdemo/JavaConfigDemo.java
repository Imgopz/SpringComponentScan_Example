package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author Gopz
 *
 */
public class JavaConfigDemo {

	public static void main(String[] args) {
		
		// read the spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the container
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		//Coach theCoach = context.getBean("tennisCoach", Coach.class); //using default bean id
		//Coach theCoach = context.getBean("cricketCoach", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily forutne
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}

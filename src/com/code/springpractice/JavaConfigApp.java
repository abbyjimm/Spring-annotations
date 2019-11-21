package com.code.springpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {
		// Read spring config - java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DanceConfig.class);
		
		// Get the bean from spring container
		Dancer  dancer = context.getBean("teenageDancer", Dancer.class);
		
		// Call a method on the bean
		System.out.println(dancer.getTrainingSchedule());
		System.out.println(dancer.getCostume());
		// Close context
		context.close();
	}

}

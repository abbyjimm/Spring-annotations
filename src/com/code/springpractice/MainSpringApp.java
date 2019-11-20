package com.code.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringApp {

	public static void main(String[] args) {
		
		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean from spring container
		Dancer dancer = context.getBean("youngDancer", Dancer.class);
		
		//Call a method on the bean
		System.out.println(dancer.getTrainingSchedule());
		
		//Close context
		context.close();

	}

}

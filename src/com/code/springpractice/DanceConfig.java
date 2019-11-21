package com.code.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DanceConfig {

	@Bean
	public CostumeService danceCostumeService() {
		return new DanceCosstumeService();
	}
	
	@Bean
	public Dancer teenageDancer() {
		return new TeenageDancer(danceCostumeService());
	}
	
}

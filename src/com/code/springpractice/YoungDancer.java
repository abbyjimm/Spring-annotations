package com.code.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YoungDancer implements Dancer {

	@Autowired
	private DanceCosstumeService costumeService;
	
	@Override
	public String getTrainingSchedule() {
		return "Training from 5p.m. to 9p.m.";
	}

	@Override
	public String getCostume() {
		return costumeService.getCostume();
	}

}

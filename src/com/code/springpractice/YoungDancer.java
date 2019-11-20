package com.code.springpractice;

import org.springframework.stereotype.Component;

@Component
public class YoungDancer implements Dancer {

	@Override
	public String getTrainingSchedule() {
		return "Training from 5p.m. to 9p.m.";
	}

}

package com.code.springpractice;

public class TeenageDancer implements Dancer {

	private CostumeService costumeService;
	
	public TeenageDancer(CostumeService theCostumeService) {
		costumeService = theCostumeService;
	}

	@Override
	public String getTrainingSchedule() {
		return "Dance 1 hours per day";
	}

	@Override
	public String getCostume() {
		return costumeService.getCostume();
	}

}

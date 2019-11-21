package com.code.springpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DanceCosstumeService implements CostumeService {

	private Random ramdomCostume = new Random();
	private List<String> listCostume;
	private String fileName = ".\\resources\\costume-data.txt";
	
	public DanceCosstumeService() {
		File file = new File(fileName);
		
		System.out.println("Reading costumes from file: "+fileName);
		System.out.println("File exists: "+file.exists());
		
		// Initialize array list
		listCostume = new ArrayList<String>();
		
		// Read fortunes from file
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null) {
				listCostume.add(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getCostume() {
		// pick a random string from the array
		int index = ramdomCostume.nextInt(listCostume.size());
		
		String tempCostume = listCostume.get(index);
		
		return tempCostume;
	}

}

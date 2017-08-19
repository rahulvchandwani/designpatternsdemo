package com.behavioralpattern.templatemethod;

public class DatabaseDataParser extends DataParser {
	
	protected void readData() {
		System.out.println("Reading data from database.");
	}
	
	protected void processData() {
		System.out.println("Processing data from database.");
	}
}

package com.behavioralpattern.templatemethod;

public class CSVDataParser extends DataParser {
	
	protected void readData() {
		System.out.println("Reading data from CSV file.");
	}
	
	protected void processData() {
		System.out.println("Processing data from CSV file.");
	}
}

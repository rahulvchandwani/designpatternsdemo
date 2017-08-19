package com.behavioralpattern.templatemethod;

public abstract class DataParser {
	
	// Template method
	public final void parseDataAndGenerateOutput() {
		readData();
		processData();
		writeData();
	}
	
	protected abstract void readData();
	
	protected abstract void processData();
	
	public void writeData() {
		System.out.println("Writing data to file.");
	}
}

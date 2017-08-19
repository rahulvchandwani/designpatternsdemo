package com.structuralpattern.facade;

public class MensWear implements Clothes {

	@Override
	public void getMinimumPrice() {
		System.out.println("Minimum price for mens wear is AED 100");
	}

	@Override
	public void getMaximumPrice() {
		System.out.println("Maximum price for mens wear is AED 5000");
	}

}

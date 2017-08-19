package com.structuralpattern.facade;

public class KidsWear implements Clothes {

	@Override
	public void getMinimumPrice() {
		System.out.println("Minimum price for kids wear is AED 50");
	}

	@Override
	public void getMaximumPrice() {
		System.out.println("Maximum price for kids wear is AED 1000");
	}

}

package com.structuralpattern.facade;

public class WomensWear implements Clothes {

	@Override
	public void getMinimumPrice() {
		System.out.println("Minimum price for womens wear is AED 200");
	}

	@Override
	public void getMaximumPrice() {
		System.out.println("Maximum price for womens wear is AED 50");
	}

}

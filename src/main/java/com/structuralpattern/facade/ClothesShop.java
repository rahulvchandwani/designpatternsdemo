package com.structuralpattern.facade;

public class ClothesShop {
	private Clothes mensWear;
	private Clothes womensWear;
	private Clothes kidsWear;
	
	public ClothesShop() {
		mensWear = new MensWear();
		womensWear = new WomensWear();
		kidsWear = new KidsWear();
	}
	
	public void getMensWearPrice() {
		mensWear.getMinimumPrice();
		mensWear.getMaximumPrice();
	}
	
	public void getWomensWearPrice() {
		womensWear.getMinimumPrice();
		womensWear.getMaximumPrice();
	}
	
	public void getKidsWearPrice() {
		kidsWear.getMinimumPrice();
		kidsWear.getMaximumPrice();
	}
}

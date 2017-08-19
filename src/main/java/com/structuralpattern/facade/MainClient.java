package com.structuralpattern.facade;

public class MainClient {
	public static void main(String[] args) {
		ClothesShop clothesShop = new ClothesShop();
		
		clothesShop.getMensWearPrice();
		clothesShop.getWomensWearPrice();
		clothesShop.getKidsWearPrice();
	}
}

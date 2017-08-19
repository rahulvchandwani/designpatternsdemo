package com.structuralpattern.decorator;

public class MainClient {
	public static void main(String[] args) {
		Pizza pizza = new VegPizza("Veg Pizza");
		System.out.println("Original Description : "+pizza.getDescription());
		System.out.println("Original Price : "+pizza.getPrice());
		
		pizza = new CheeseDecorator(pizza);
		System.out.println("Original Description : "+pizza.getDescription());
		System.out.println("Original Price : "+pizza.getPrice());
		
		pizza = new PaneerDecorator(pizza);
		System.out.println("Original Description : "+pizza.getDescription());
		System.out.println("Original Price : "+pizza.getPrice());
	}
}

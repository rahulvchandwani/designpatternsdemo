package com.structuralpattern.flyweight;

public class MainClient {
	public static void main(String[] args) {
		CoffeeFlyweightFactory coffeeFactory = new CoffeeFlyweightFactory();
		Coffee coffee = coffeeFactory.getCoffee("Cappuccino");
		System.out.println(coffee.getFlavor());
	}
}

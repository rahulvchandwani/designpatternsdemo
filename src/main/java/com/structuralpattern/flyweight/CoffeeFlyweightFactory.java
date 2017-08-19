package com.structuralpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFlyweightFactory {
	private Map<String, Coffee> coffeeMap = new HashMap<>();
	
	public Coffee getCoffee(String flavor) {
		Coffee coffee = coffeeMap.get(flavor);
		
		if(coffee == null) {
			coffee = new Coffee(flavor);
			coffeeMap.put(flavor, coffee);
		}
		
		return coffee;
	}
}

package com.structuralpattern.flyweight;

public class Coffee implements ICoffee {
	
	private String flavor;
	
	public Coffee(String flavor) {
		this.flavor = flavor;
	}
	
	public String getFlavor() {
		return this.flavor;
	}

	@Override
	public void serveCoffee(int tableNumber) {
		System.out.println("Serve coffee to table number : "+tableNumber);
	}

}

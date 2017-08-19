package com.behavioralpattern.visitor;

public class Fruit implements Item {

	private String name;
	private int pricePerKg;
	private int quantity;
	
	public Fruit(String name, int pricePerKg, int quantity) {
		this.name = name;
		this.pricePerKg = pricePerKg;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPricePerKg() {
		return pricePerKg;
	}
	
	public int getQuantity() {
		return quantity;
	}

	@Override
	public String accept(ShoppingCartVisitor visitor) {
		return visitor.getPrice(this);
	}

}

package com.structuralpattern.decorator;

import java.math.BigDecimal;

public class CheeseDecorator extends PizzaDecorator {
	private Pizza pizza;
	
	public CheeseDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return this.pizza.getDescription() + " with Cheese";
	}

	@Override
	public BigDecimal getPrice() {
		return this.pizza.getPrice().add(new BigDecimal("10"));
	}
}

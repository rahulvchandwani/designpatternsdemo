package com.structuralpattern.decorator;

import java.math.BigDecimal;

public class PaneerDecorator extends PizzaDecorator {
	private Pizza pizza;
	
	public PaneerDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return this.pizza.getDescription() + " with Paneer";
	}

	@Override
	public BigDecimal getPrice() {
		return this.pizza.getPrice().add(new BigDecimal("50"));
	}
}

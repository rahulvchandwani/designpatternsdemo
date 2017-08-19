package com.structuralpattern.decorator;

import java.math.BigDecimal;

public class VegPizza implements Pizza {
	
	String description;
	BigDecimal price;

	public VegPizza(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public BigDecimal getPrice() {
		return new BigDecimal("100");
	}

}

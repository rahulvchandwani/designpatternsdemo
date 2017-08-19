package com.creationalpattern.factory;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		buildCar();
	}

	@Override
	protected void buildCar() {
		System.out.println("Building Luxury Car!!");
	}
}

package com.creationalpattern.abstractfactory;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		buildCar();
	}
	
	@Override
	protected void buildCar() {
		System.out.println("Building Luxury Car!!");
	}
}

package com.creationalpattern.abstractfactory;

public class SedanCar extends Car {
	
	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		buildCar();
	}

	@Override
	protected void buildCar() {
		System.out.println("Building Sedan Car!!");
	}
}

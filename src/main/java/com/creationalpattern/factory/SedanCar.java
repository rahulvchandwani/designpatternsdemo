package com.creationalpattern.factory;

public class SedanCar extends Car {
	
	public SedanCar() {
		super(CarType.SEDAN);
		buildCar();
	}

	@Override
	protected void buildCar() {
		System.out.println("Building Sedan Car!!");
	}
}

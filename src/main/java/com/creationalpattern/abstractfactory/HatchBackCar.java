package com.creationalpattern.abstractfactory;

public class HatchBackCar extends Car {

	public HatchBackCar(Location location) {
		super(CarType.HATCHBACK, location);
		buildCar();
	}

	@Override
	protected void buildCar() {
		System.out.println("Building HatchBack car!!");
	}
}

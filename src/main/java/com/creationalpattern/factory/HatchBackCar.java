package com.creationalpattern.factory;

public class HatchBackCar extends Car {

	public HatchBackCar() {
		super(CarType.HATCHBACK);
		buildCar();
	}

	@Override
	protected void buildCar() {
		System.out.println("Building HatchBack car!!");
	}
}

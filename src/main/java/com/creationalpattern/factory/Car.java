package com.creationalpattern.factory;

public abstract class Car {
	
	private CarType carType;
	
	public Car(CarType carType) {
		this.carType = carType;
	}
	
	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	protected abstract void buildCar();

	@Override
	public String toString() {
		return "Car [carType=" + carType + "]";
	}
}
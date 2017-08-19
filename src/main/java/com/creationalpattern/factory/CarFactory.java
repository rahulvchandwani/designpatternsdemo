package com.creationalpattern.factory;

public class CarFactory {
	
	public static Car getCar(CarType carType) {
		Car car = null;
		switch(carType) {
		case SEDAN :
			car = new SedanCar();
			break;
		case HATCHBACK :
			car = new HatchBackCar();
			break;
		case LUXURY :
			car = new LuxuryCar();
			break;
		default :
			// throw new Exception
			break;
		}
		return car;
	}
}

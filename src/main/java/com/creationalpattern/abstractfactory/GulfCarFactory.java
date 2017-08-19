package com.creationalpattern.abstractfactory;

public class GulfCarFactory {

	public static Car getCar(CarType carType) {
		Car car = null;
		switch(carType) {
		case SEDAN :
			car = new SedanCar(Location.GULF);
			break;
		case HATCHBACK :
			car = new HatchBackCar(Location.GULF);
			break;
		case LUXURY :
			car = new LuxuryCar(Location.GULF);
			break;
		default :
			// throw new Exception
			break;
		}
		return car;
	}
}

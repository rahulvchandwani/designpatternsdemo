package com.creationalpattern.abstractfactory;

public class AsiaCarFactory {

	public static Car getCar(CarType carType) {
		Car car = null;
		switch(carType) {
		case SEDAN :
			car = new SedanCar(Location.ASIA);
			break;
		case HATCHBACK :
			car = new HatchBackCar(Location.ASIA);
			break;
		case LUXURY :
			car = new LuxuryCar(Location.ASIA);
			break;
		default :
			// throw new Exception
			break;
		}
		return car;
	}

}

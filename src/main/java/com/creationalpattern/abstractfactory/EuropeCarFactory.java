package com.creationalpattern.abstractfactory;

public class EuropeCarFactory {

	public static Car getCar(CarType carType) {
		Car car = null;
		switch(carType) {
		case SEDAN :
			car = new SedanCar(Location.EUROPE);
			break;
		case HATCHBACK :
			car = new HatchBackCar(Location.EUROPE);
			break;
		case LUXURY :
			car = new LuxuryCar(Location.EUROPE);
			break;
		default :
			// throw new Exception
			break;
		}
		return car;
	}

}

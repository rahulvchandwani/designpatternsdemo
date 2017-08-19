package com.creationalpattern.abstractfactory;

public class CarFactory {
	
	public static Car getCar(CarType carType) {
		Car car = null;
		Location location = Location.ASIA;
		
		switch(location) {
		case ASIA :
			car = AsiaCarFactory.getCar(carType);
			break;
		case GULF :
			car = GulfCarFactory.getCar(carType);
			break;
		case EUROPE :
			car = EuropeCarFactory.getCar(carType);
			break;
		default :
			// throw new Exception
			break;
		}
		return car;
	}
}

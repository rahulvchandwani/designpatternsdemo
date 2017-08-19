package com.creationalpattern.factory;

public class FactoryPattern {
	public static void main(String[] args) {
		System.out.println(CarFactory.getCar(CarType.SEDAN));
		System.out.println(CarFactory.getCar(CarType.HATCHBACK));
		System.out.println(CarFactory.getCar(CarType.LUXURY));
	}
}

package com.behavioralpattern.servicelocator;

public class MainClient {
	public static void main(String[] args) {
		Service paymentService = ServiceLocator.getService("Payment Service");
		paymentService.execute();
		
		Service cabService = ServiceLocator.getService("CAB Service");
		cabService.execute();
	}
}

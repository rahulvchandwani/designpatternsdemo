package com.behavioralpattern.servicelocator;

public class PaymentService implements Service {

	@Override
	public String getName() {
		return "Payment Service";
	}

	@Override
	public void execute() {
		System.out.println("Executing payment service...");
	}

}

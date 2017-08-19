package com.behavioralpattern.servicelocator;

public class InitialContext {
	public Object lookup(String serviceName) {
		if(serviceName.equals("Payment Service")) {
			return new PaymentService();
		} else if(serviceName.equals("CAB Service")) {
			return new CabService();
		}
		return null;
	}
}

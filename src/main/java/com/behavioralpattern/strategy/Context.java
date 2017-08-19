package com.behavioralpattern.strategy;

public class Context {
	private PaymentStrategy paymentStrategy;
	
	public Context(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void pay(String amount) {
		paymentStrategy.pay(amount);
	}
}

package com.behavioralpattern.strategy;

public class MainClient {
	
	public static void main(String[] args) {
		CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
		Context context = new Context(creditCardPaymentStrategy);
		context.pay("AED 1000");
	}
	
}

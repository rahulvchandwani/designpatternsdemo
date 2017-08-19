package com.behavioralpattern.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay(String amount) {
		System.out.println("Payment of "+amount+" is being done using CREDIT card.");
	}

}

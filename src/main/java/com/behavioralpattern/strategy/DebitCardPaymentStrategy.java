package com.behavioralpattern.strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay(String amount) {
		System.out.println("Payment of "+amount+" is being done using DEBIT card.");
	}

}

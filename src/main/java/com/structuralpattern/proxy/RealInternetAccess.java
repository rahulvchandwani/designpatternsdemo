package com.structuralpattern.proxy;

public class RealInternetAccess implements InternetAccess {

	private String employeeName;
	
	public RealInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantAccess() {
		System.out.println("Internet access granted to employee : "+this.employeeName);
	}

}

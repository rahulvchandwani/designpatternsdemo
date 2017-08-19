package com.structuralpattern.proxy;

public class ProxyInternetAccess implements InternetAccess {
	
	private String employeeName;
	private RealInternetAccess realInternetAccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantAccess() {
		if(this.employeeName.equals("Rahul")) {
			realInternetAccess = new RealInternetAccess(this.employeeName);
			realInternetAccess.grantAccess();
		} else {
			System.out.println("Cannot provide internet access to the employee");
		}
	}

}

package com.structuralpattern.proxy;

public class MainClient {
	public static void main(String[] args) {
		InternetAccess internetAccess = new ProxyInternetAccess("Rahul");
		internetAccess.grantAccess();
	}
}

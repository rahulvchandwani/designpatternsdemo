package com.structuralpattern.classadapter;

public class MainClient {
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone(new MobileAdapter());
		
		System.out.println("*** Accessing Apple Features ***");
		
		iphone.searchUsing("Siri");
		iphone.navigateThrough("Apple Maps");
		iphone.downloadVia("App Store");
		
		System.out.println("\n*** Accessing Samsung Features ***");
		
		iphone.searchUsing("Google Now");
		iphone.navigateThrough("Google Maps");
		iphone.downloadVia("Play Store");
	}
}

package com.structuralpattern.classadapter;

public class Iphone implements Ios {
	
	MobileAdapter mobileAdapter;
	
	public Iphone(MobileAdapter mobileAdapter) {
		this.mobileAdapter = mobileAdapter;
	}
	
	@Override
	public void searchUsing(String voiceCommand) {
		if(voiceCommand.equals("Siri")) {
			System.out.println("Search using "+voiceCommand);
		} else {
			mobileAdapter.searchUsing(voiceCommand);
		}
	}

	@Override
	public void navigateThrough(String mapName) {
		if(mapName.equals("Apple Maps")) {
			System.out.println("Navigating through "+mapName);
		} else {
			mobileAdapter.navigateThrough(mapName);
		}
	}

	@Override
	public void downloadVia(String storeName) {
		if(storeName.equals("App Store")) {
			System.out.println("Downloading via "+storeName);
		} else {
			mobileAdapter.downloadVia(storeName);
		}
	}

}

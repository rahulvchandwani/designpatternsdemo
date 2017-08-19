package com.structuralpattern.classadapter;

public class Samsung implements Android {

	@Override
	public void searchUsing(String voiceCommand) {
		System.out.println("Search using "+voiceCommand);
	}

	@Override
	public void navigateThrough(String mapName) {
		System.out.println("Navigating through "+mapName);
	}

	@Override
	public void downloadVia(String storeName) {
		System.out.println("Downloading via "+storeName);
	}

}

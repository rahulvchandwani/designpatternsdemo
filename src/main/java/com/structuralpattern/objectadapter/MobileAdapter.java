package com.structuralpattern.objectadapter;

public class MobileAdapter implements Ios {
	
	Samsung samsung;
	Microsoft microsoft;
	
	public MobileAdapter() {
		samsung = new Samsung();
		microsoft = new Microsoft();
	}

	@Override
	public void searchUsing(String voiceCommand) {
		if(voiceCommand.equals("Google Now")) {
			samsung.searchUsing(voiceCommand);
		} else {
			microsoft.searchUsing(voiceCommand);
		}
	}

	@Override
	public void navigateThrough(String mapName) {
		if(mapName.equals("Google Maps")) {
			samsung.navigateThrough(mapName);
		} else {
			microsoft.navigateThrough(mapName);
		}
	}

	@Override
	public void downloadVia(String storeName) {
		if(storeName.equals("Play Store")) {
			samsung.downloadVia(storeName);
		} else {
			microsoft.downloadVia(storeName);
		}
	}

}

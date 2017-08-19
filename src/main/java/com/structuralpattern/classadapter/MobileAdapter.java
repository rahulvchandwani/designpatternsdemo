package com.structuralpattern.classadapter;

public class MobileAdapter extends Samsung implements Ios {
	
	public MobileAdapter() {

	}

	@Override
	public void searchUsing(String voiceCommand) {
		if(voiceCommand.equals("Google Now")) {
			super.searchUsing(voiceCommand);
		}
	}

	@Override
	public void navigateThrough(String mapName) {
		if(mapName.equals("Google Maps")) {
			super.navigateThrough(mapName);
		}
	}

	@Override
	public void downloadVia(String storeName) {
		if(storeName.equals("Play Store")) {
			super.downloadVia(storeName);
		}
	}

}

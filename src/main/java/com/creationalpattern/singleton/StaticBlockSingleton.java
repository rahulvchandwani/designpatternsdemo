package com.creationalpattern.singleton;

public class StaticBlockSingleton {
	private static final StaticBlockSingleton singleton;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			singleton = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Error occured while creating Singleton object");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return singleton;
	}
}

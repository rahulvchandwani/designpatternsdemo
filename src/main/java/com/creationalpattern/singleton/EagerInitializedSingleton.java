package com.creationalpattern.singleton;

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton singleton = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {}
	
	public static EagerInitializedSingleton getInstance() {
		return singleton;
	}
}

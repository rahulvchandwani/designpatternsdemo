package com.creationalpattern.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton singleton;
	
	private LazyInitializedSingleton() {}
	
	public static LazyInitializedSingleton getInstance() {
		if(singleton == null) {
			singleton = new LazyInitializedSingleton();
		}
		return singleton;
	}
}

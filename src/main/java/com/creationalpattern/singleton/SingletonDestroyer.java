package com.creationalpattern.singleton;

import java.lang.reflect.Constructor;

public class SingletonDestroyer {
	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		try {
			Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for(Constructor<?> constructor : constructors) {
				//Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
		System.out.println(instanceOne);
		System.out.println(instanceTwo);
	}
}

package com.structuralpattern.bridge;

public abstract class Application {
	
	protected Theme theme;
	
	public Application(Theme theme) {
		this.theme = theme;
	}
	
	public abstract void login(String userName, String password, String color);
	
	public abstract void register(User user, String color);
}

package com.structuralpattern.bridge;

public class WebApplication extends Application {

	public WebApplication(Theme theme) {
		super(theme);
	}

	@Override
	public void login(String userName, String password, String color) {
		System.out.print("User login successful in web application with ");
		this.theme.applyColor(color);
	}

	@Override
	public void register(User user, String color) {
		System.out.print("User registered successfully in web application with");
		this.theme.applyColor(color);
	}

}
